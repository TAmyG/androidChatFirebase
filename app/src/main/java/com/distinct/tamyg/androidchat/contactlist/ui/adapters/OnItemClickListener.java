package com.distinct.tamyg.androidchat.contactlist.ui.adapters;

import com.distinct.tamyg.androidchat.entities.User;

/**
 * Created by tamyg on 12/06/16.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
