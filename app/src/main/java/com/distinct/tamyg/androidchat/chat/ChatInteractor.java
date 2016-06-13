package com.distinct.tamyg.androidchat.chat;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ChatInteractor {
    void sendMessage(String msg);
    void setRecipient(String Recipient);
    void subscribe();
    void unsubscribe();
    void destroyListener();
}
