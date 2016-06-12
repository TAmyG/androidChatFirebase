package com.distinct.tamyg.androidchat.contactlist;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ContactListSessionInteractor {

    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);

}
