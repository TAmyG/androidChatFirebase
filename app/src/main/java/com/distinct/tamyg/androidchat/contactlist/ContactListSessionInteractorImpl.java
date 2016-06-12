package com.distinct.tamyg.androidchat.contactlist;

/**
 * Created by tamyg on 12/06/16.
 */
public class ContactListSessionInteractorImpl implements ContactListSessionInteractor {
    ContactListRepository repository;

    public ContactListSessionInteractorImpl() {
        repository = new ContactListRepositoryImpl();
    }

    @Override
    public void signOff() {
        repository.signOff();
    }

    @Override
    public String getCurrentUserEmail() {
        return repository.getCurrentUserEmail();
    }

    @Override
    public void changeConnectionStatus(boolean online) {
        repository.changeConnectionStatus(online);
    }
}
