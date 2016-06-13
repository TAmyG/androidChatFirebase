package com.distinct.tamyg.androidchat.chat;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatSessionInteractorImpl implements ChatSessionInteractor {
    private ChatRepository chatRepository;

    public ChatSessionInteractorImpl() {
        this.chatRepository = new ChatRepositoryImpl();
    }

    @Override
    public void changeConnectionStatus(boolean online) {
        chatRepository.changeConnectionStatus(online);
    }
}
