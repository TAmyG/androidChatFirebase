package com.distinct.tamyg.androidchat.contactlist;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ContactListRepository {
    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);

    void destroyListener();
    void subscribeToContactListEvent();
    void onsubscribeToContactListEvent();

    void changeConnectionStatus(boolean online);

}
