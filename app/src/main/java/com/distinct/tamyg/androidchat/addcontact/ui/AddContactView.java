package com.distinct.tamyg.androidchat.addcontact.ui;

/**
 * Created by tamyg on 12/06/16.
 */
public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
