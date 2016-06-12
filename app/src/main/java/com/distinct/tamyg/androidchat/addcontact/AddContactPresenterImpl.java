package com.distinct.tamyg.androidchat.addcontact;

import com.distinct.tamyg.androidchat.addcontact.events.AddContactEvent;
import com.distinct.tamyg.androidchat.addcontact.ui.AddContactFragment;
import com.distinct.tamyg.androidchat.addcontact.ui.AddContactView;

/**
 * Created by tamyg on 12/06/16.
 */
public class AddContactPresenterImpl implements AddContactPresenter {
    private AddContactView view;

    public AddContactPresenterImpl(AddContactView view) {
        this.view = view;
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void addContact(String email) {

    }

    @Override
    public void onEventMainThread(AddContactEvent event) {

    }
}
