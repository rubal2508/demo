package com.example.demo.service;

import com.example.demo.model.RegisteredUser;
import com.example.demo.repo.RegisteredUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    private RegisteredUserRepository registeredUserRepository;

    public List<RegisteredUser> registerUser(List<RegisteredUser> users){
        return registeredUserRepository.saveAll(users);
    }
}
