package com.distinct.tamyg.androidchat.login;

/**
 * Created by tamyg on 9/06/16.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignIn(String email, String password);
    void doSignUp(String email, String password);

}
