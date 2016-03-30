package com.msi;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bo-yang on 3/30/2016.
 */
@RestController
@RequestMapping(value="/user")
public class Api {

    List<User> users = new ArrayList<>();
    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<User> getUsers(){

        users.add(new User("a", 1));
        return users;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public void addUser(@RequestBody User user){
        users.add(user);
    }
}
