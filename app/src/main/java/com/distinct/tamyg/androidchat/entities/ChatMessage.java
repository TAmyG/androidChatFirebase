package com.distinct.tamyg.androidchat.entities;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatMessage {
    String msg;
    String sender;
    boolean sentByMe;

    public ChatMessage(){}

    public ChatMessage(String sender, String msg){
        this.msg = msg;
        this.sender = sender;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public boolean isSentByMe() {
        return sentByMe;
    }

    public void setSentByMe(boolean sentByMe) {
        this.sentByMe = sentByMe;
    }

    @Override
    public boolean equals(Object obj){
        boolean equals = false;
        if(obj instanceof User){
            ChatMessage msg = (ChatMessage)obj;
            equals = this.sender.equals(msg.getSender()) && this.msg.equals(msg.getMsg())
                    && this.sentByMe == msg.sentByMe;
        }
        return equals;
    }
}
