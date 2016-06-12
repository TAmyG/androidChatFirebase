package com.distinct.tamyg.androidchat.login;

import android.util.Log;

import com.distinct.tamyg.androidchat.domain.FirebaseHelper;

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
        Log.e("LoginRepositoryImpl", "signUp");
    }

    @Override
    public void signIn(String email, String password) {
        Log.e("LoginRepositoryImpl", "signIn");
    }

    @Override
    public void checkSession() {
        Log.e("LoginRepositoryImpl", "checkSession");
    }
}
