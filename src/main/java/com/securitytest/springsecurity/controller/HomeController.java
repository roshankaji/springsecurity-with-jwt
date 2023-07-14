package com.securitytest.springsecurity.controller;

import com.securitytest.springsecurity.model.User;
import com.securitytest.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "Testing Spring Security";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
