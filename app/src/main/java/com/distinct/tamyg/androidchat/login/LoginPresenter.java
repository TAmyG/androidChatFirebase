package com.distinct.tamyg.androidchat.login;

/**
 * Created by tamyg on 9/06/16.
 */
public interface LoginPresenter {
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
