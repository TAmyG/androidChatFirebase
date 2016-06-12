package com.distinct.tamyg.androidchat.addcontact;

import com.distinct.tamyg.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by tamyg on 12/06/16.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
