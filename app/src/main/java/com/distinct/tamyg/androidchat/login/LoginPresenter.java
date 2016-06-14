package com.distinct.tamyg.androidchat.login;

import com.distinct.tamyg.androidchat.login.event.LoginEvent;

/**
 * Created by tamyg on 9/06/16.
 */
public interface LoginPresenter {
    void onDestroy();
    void onCreate();
    void onPause();
    void onResume();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent loginEvent);
}
