package com.distinct.tamyg.androidchat.chat.ui;

import com.distinct.tamyg.androidchat.entities.ChatMessage;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ChatView {
    void onMessageReceived(ChatMessage msg);


}
