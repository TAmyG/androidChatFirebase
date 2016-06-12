package com.distinct.tamyg.androidchat.contactlist;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ContactListInteractor {
    void subscribe();
    void onsubscribe();
    void destroyListener();
    void removeContact(String email);
}
