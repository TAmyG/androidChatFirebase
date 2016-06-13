package com.distinct.tamyg.androidchat.chat;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatInteractorImpl implements ChatInteractor {

    private ChatRepository chatRepository;

    public ChatInteractorImpl() {
        this.chatRepository = new ChatRepositoryImpl();
    }

    @Override
    public void sendMessage(String msg) {
        chatRepository.sendMessage(msg);
    }

    @Override
    public void setRecipient(String Recipient) {
        chatRepository.setRecipient(Recipient);
    }

    @Override
    public void subscribe() {
        chatRepository.subscribe();
    }

    @Override
    public void unsubscribe() {
        chatRepository.unsubscribe();
    }

    @Override
    public void destroyListener() {
        chatRepository.destroyListener();
    }
}
