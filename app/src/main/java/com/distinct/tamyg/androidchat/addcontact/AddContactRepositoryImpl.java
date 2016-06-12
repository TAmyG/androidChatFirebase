package com.distinct.tamyg.androidchat.addcontact;

import com.distinct.tamyg.androidchat.addcontact.events.AddContactEvent;
import com.distinct.tamyg.androidchat.domain.FirebaseHelper;
import com.distinct.tamyg.androidchat.entities.User;
import com.distinct.tamyg.androidchat.lib.EventBus;
import com.distinct.tamyg.androidchat.lib.GreenRobotEventBus;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by tamyg on 12/06/16.
 */
public class AddContactRepositoryImpl implements AddContactRepository {
    private EventBus eventBus;
    private FirebaseHelper helper;

    public AddContactRepositoryImpl() {
        this.eventBus = GreenRobotEventBus.getInstance();
        this.helper = FirebaseHelper.getInstance();
    }

    @Override
    public void addContact(String email) {
        final String key = email.replace(".","_");
        Firebase userReference = helper.getUserReference(key);
        userReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                if(user != null){
                    Firebase myContactReference= helper.getMyContactsReference();
                    myContactReference.child(key).setValue(user.isOnline());

                    String currentUserKey = helper.getAuthUserEmail();
                    currentUserKey = currentUserKey.replace(".", "_");

                    Firebase reverseContactReference = helper.getContactsReference(key);
                    reverseContactReference.child(currentUserKey).setValue(User.ONLINE);

                    postSuccess();

                }else{
                    postError();
                }

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                postError();
            }
        });
    }

    private void postSuccess() {
        post(false);
    }

    private void postError() {
        post(true);
    }

    private  void post(boolean error){
        AddContactEvent event = new AddContactEvent();
        event.setError(error);
        eventBus.post(event);
    }
}
