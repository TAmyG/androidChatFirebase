package com.distinct.tamyg.androidchat.login;

/**
 * Created by tamyg on 11/06/16.
 */
public class LoginInteractorImpl implements LoginInteractor {
    private LoginRepository loginRepository;

    public LoginInteractorImpl(){
        loginRepository = new LoginRepositoryImpl();
    }

    @Override
    public void checkSession() {
        loginRepository.checkSession();
    }

    @Override
    public void doSignIn(String email, String password) {
        loginRepository.signIn(email, password);
    }

    @Override
    public void doSignUp(String email, String password) {
        loginRepository.signUp(email, password);
    }
}
