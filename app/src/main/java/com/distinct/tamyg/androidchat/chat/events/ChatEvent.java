package com.distinct.tamyg.androidchat.chat.events;

import com.distinct.tamyg.androidchat.entities.ChatMessage;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatEvent {
    private ChatMessage message;
    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
