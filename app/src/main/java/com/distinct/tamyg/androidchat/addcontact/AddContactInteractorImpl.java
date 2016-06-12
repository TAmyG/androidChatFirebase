package com.distinct.tamyg.androidchat.addcontact;

/**
 * Created by tamyg on 12/06/16.
 */
public class AddContactInteractorImpl implements AddContactInteractor {
    private AddContactRepository repository;

    public AddContactInteractorImpl() {
        this.repository = new AddContactRepositoryImpl();
    }

    @Override
    public void execute(String email) {
        repository.addContact(email);
    }
}
