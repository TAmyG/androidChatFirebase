package com.distinct.tamyg.androidchat.chat;

import com.distinct.tamyg.androidchat.chat.events.ChatEvent;
import com.distinct.tamyg.androidchat.chat.ui.ChatView;
import com.distinct.tamyg.androidchat.entities.User;
import com.distinct.tamyg.androidchat.lib.EventBus;
import com.distinct.tamyg.androidchat.lib.GreenRobotEventBus;

import org.greenrobot.eventbus.Subscribe;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatPresenterImpl implements ChatPresenter{
    private ChatView view;
    private EventBus eventBus;
    private ChatInteractor interactor;
    private ChatSessionInteractor sessionInteractor;

    public ChatPresenterImpl(ChatView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.interactor = new ChatInteractorImpl();
        this.sessionInteractor = new ChatSessionInteractorImpl();
    }

    @Override
    public void onResume() {
        interactor.subscribe();
        sessionInteractor.changeConnectionStatus(User.ONLINE);
    }

    @Override
    public void onPause() {
        interactor.unsubscribe();
        sessionInteractor.changeConnectionStatus(User.OFFLINE);
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        eventBus.unregister(this);
        interactor.destroyListener();
        view = null;
    }

    @Override
    public void setChatRecipient(String Recipient) {
        interactor.setRecipient(Recipient);
    }

    @Override
    public void sendMessage(String message) {
        interactor.sendMessage(message);
    }

    @Override
    @Subscribe
    public void onEventMainThread(ChatEvent event) {
        if(view != null){
            view.onMessageReceived(event.getMessage());
        }
    }
}
