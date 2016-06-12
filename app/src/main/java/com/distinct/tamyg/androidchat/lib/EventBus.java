package com.distinct.tamyg.androidchat.lib;


/**
 * Created by tamyg on 11/06/16.
 */
public interface EventBus {

    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
