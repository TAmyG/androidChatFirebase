package com.distinct.tamyg.androidchat.chat;

import com.distinct.tamyg.androidchat.chat.events.ChatEvent;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ChatPresenter {
    void onResume();
    void onPause();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String Recipient);
    void sendMessage(String message);
    void onEventMainThread(ChatEvent event);

}
