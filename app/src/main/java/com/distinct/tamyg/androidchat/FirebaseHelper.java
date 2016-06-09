package com.distinct.tamyg.androidchat;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;

import java.util.Map;

/**
 * Created by tamyg on 8/06/16.
 */
public class FirebaseHelper {

    private Firebase dataReference;

    private static String SEPARATOR = "___";
    private static String CHATS_PATH = "chats";
    private static String USERS_PATH = "users";
    private static String CONTACTS_PATH = "contacts";
    private static String FIREBASE_URL = "https://android-chat-tamyg.firebaseio.com/";

    private static class SingletonHolder{
        private static final FirebaseHelper INSTANCE = new FirebaseHelper();
    }

    public  static FirebaseHelper getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public FirebaseHelper() {
        this.dataReference = new Firebase(FIREBASE_URL);
    }

    public Firebase getDataReference() {
        return dataReference;
    }

    public String getAuthUserEmail(){
        AuthData authData = dataReference.getAuth();
        String email = null;
        if(authData != null){
            Map<String, Object> providerData = authData.getProviderData();
            email = providerData.get("email").toString();
        }
        return email;
    }
}
