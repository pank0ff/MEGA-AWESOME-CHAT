package com.example.storage;

import java.util.HashSet;
import java.util.Set;

public class UserStorage {
    private static UserStorage instanse;
    private Set<String> users;
    private UserStorage(){
        users = new HashSet<>();
    }
    public static synchronized UserStorage getInstance(){
        if(instanse == null){
            instanse = new UserStorage();
        }
        return instanse;
    }

    public Set<String> getUsers(){
        return users;
    }
    public void setUser(String username) throws Exception {
        if(users.contains(username)){
            throw  new Exception("Users already exist with username: "+ username);
        }
        users.add(username);
    }

}
