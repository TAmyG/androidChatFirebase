package com.distinct.tamyg.androidchat.contactlist.ui;

import com.distinct.tamyg.androidchat.entities.User;

/**
 * Created by tamyg on 12/06/16.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);

}
