package com.distinct.tamyg.androidchat.chat;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ChatRepository {
    void changeConnectionStatus(boolean onlnine);

    void sendMessage(String msg);
    void setRecipient(String Recipient);
    void subscribe();
    void unsubscribe();
    void destroyListener();
}
