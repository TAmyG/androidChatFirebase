package com.distinct.tamyg.androidchat.addcontact.events;

/**
 * Created by tamyg on 12/06/16.
 */
public class AddContactEvent {

    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
