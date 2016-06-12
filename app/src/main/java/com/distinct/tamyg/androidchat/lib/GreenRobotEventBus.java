package com.distinct.tamyg.androidchat.lib;

/**
 * Created by tamyg on 11/06/16.
 */
public class GreenRobotEventBus implements EventBus {

    org.greenrobot.eventbus.EventBus eventBus;

    public GreenRobotEventBus() {
        this.eventBus = new org.greenrobot.eventbus.EventBus().getDefault();
    }

    private static class SingletonHolder{
        private static final GreenRobotEventBus INSTANCE = new GreenRobotEventBus();
    }

    public static GreenRobotEventBus getInstance(){
        return SingletonHolder.INSTANCE;
    }

    @Override
    public void register(Object subscriber) {
        eventBus.register(subscriber);
    }

    @Override
    public void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
