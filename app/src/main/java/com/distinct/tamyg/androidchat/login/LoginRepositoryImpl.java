package com.distinct.tamyg.androidchat.login;

import android.util.Log;

import com.distinct.tamyg.androidchat.domain.FirebaseHelper;
import com.distinct.tamyg.androidchat.lib.EventBus;
import com.distinct.tamyg.androidchat.lib.GreenRobotEventBus;
import com.distinct.tamyg.androidchat.login.event.LoginEvent;

/**
 * Created by tamyg on 11/06/16.
 */
public class LoginRepositoryImpl implements LoginRepository {

    private FirebaseHelper helper;

    public LoginRepositoryImpl() {
        this.helper = FirebaseHelper.getInstance();
    }

    @Override
    public void signUp(String email, String password) {
        postEvent(LoginEvent.onSignUpSuccess);
    }

    @Override
    public void signIn(String email, String password) {

        postEvent(LoginEvent.onSignInSuccess);
    }

    @Override
    public void checkSession() {
        postEvent(LoginEvent.onFailedToRecoverSession);
    }

    private void postEvent(int type, String errorMessage){
        LoginEvent loginEvent = new LoginEvent();
        loginEvent.setEventType(type);

        if(errorMessage != null)
            loginEvent.setErrorMessage(errorMessage);

        EventBus eventBus = new GreenRobotEventBus().getInstance();
        eventBus.post(loginEvent);
    }

    private void postEvent(int type){
        postEvent(type, null);
    }
}
