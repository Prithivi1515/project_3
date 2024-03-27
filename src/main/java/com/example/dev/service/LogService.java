package com.example.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dev.domain.User;
import com.example.dev.repository.LogRepo;

@Service
public class LogService {

    @Autowired
    private LogRepo rep;
    public User log(String username, String password)
    {
        User user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
