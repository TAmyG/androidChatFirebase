package com.distinct.tamyg.androidchat.contactlist;

import com.distinct.tamyg.androidchat.contactlist.event.ContactListEvent;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ContactListPresenter {
    void onCreate();
    void onDestroy();
    void onPause();
    void onResume();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
