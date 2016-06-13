package com.distinct.tamyg.androidchat.chat;

import com.distinct.tamyg.androidchat.chat.events.ChatEvent;
import com.distinct.tamyg.androidchat.chat.ui.ChatView;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatPresenterImpl implements ChatPresenter{
    private ChatView view;

    public ChatPresenterImpl(ChatView view) {
        this.view = view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void setChatRecipient(String Recipient) {

    }

    @Override
    public void sendMessage(String message) {

    }

    @Override
    public void onEventMainThread(ChatEvent event) {

    }
}
