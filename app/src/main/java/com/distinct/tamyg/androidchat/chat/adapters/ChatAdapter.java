package com.distinct.tamyg.androidchat.chat.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.distinct.tamyg.androidchat.entities.ChatMessage;

/**
 * Created by tamyg on 12/06/16.
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder>{


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void add(ChatMessage msg) {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
