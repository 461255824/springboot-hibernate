package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.res.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/user")
    public Response getUser(){
        User user = userRepository.findUserById(1);
        Response r = new Response();
        r.setStatus(200);
        r.setResult(user);
        return r;
    }
}
