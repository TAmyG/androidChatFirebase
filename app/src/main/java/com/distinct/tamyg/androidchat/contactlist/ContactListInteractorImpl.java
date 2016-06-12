package com.distinct.tamyg.androidchat.contactlist;

/**
 * Created by tamyg on 12/06/16.
 */
public class ContactListInteractorImpl implements ContactListInteractor {

    ContactListRepository repository;

    public ContactListInteractorImpl() {
        repository = new ContactListRepositoryImpl();
    }

    @Override
    public void subscribe() {
        repository.subscribeToContactListEvent();

    }

    @Override
    public void onsubscribe() {
        repository.onsubscribeToContactListEvent();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();

    }

    @Override
    public void removeContact(String email) {
        repository.removeContact(email);
    }
}
