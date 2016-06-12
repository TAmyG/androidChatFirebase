package com.distinct.tamyg.androidchat.login.event;

/**
 * Created by tamyg on 11/06/16.
 */
public class LoginEvent {

    public final static int onSignInError = 0;
    public final static int onSignUpError = 1;
    public final static int onSignInSuccess = 2;
    public final static int onSignUpSuccess = 3;
    public final static int onFailedToRecoverSession = 4;

    private int eventType;
    private String errorMessage;

    public int getEventType() {
        return eventType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
