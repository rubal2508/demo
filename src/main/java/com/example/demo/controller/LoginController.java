package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.model.RegisteredUser;
import com.example.demo.model.Theatre;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/registerUser")
    public List<RegisteredUser> registerUser(@RequestBody List<RegisteredUser> users){
        return loginService.registerUser(users);
    }

}
