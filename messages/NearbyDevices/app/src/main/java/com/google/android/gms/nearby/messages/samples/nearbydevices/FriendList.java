package com.google.android.gms.nearby.messages.samples.nearbydevices;

import java.util.ArrayList;

/**
 * Created by mbzhu on 12/12/2017.
 */

public class FriendList extends ArrayList<Friend>{

    public void addFriend(String n, boolean wantToFind){
        add(new Friend(n, wantToFind));
    }

    public String[] viewFriends(){
        String[] xlist = new String[size()];
        for(int i = 0; i < size(); i++){
            xlist[i] = get(i).toString();
        }
        return xlist;
    }
}