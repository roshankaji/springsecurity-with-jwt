package com.securitytest.springsecurity.service;

import com.securitytest.springsecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> users = new ArrayList<User>();

    public UserService(){
        users.add(new User(UUID.randomUUID().toString(),"test","test@test.com"));
        users.add(new User(UUID.randomUUID().toString(),"TestUser1","test1@test.com"));
        users.add(new User(UUID.randomUUID().toString(),"TestUser2","test2@test.com"));
        users.add(new User(UUID.randomUUID().toString(),"TestUser3","test3@test.com"));
    }

    public List<User> getUsers(){
        return users;
    }
}
