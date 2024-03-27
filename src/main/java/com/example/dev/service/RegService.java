package com.example.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dev.domain.User;
import com.example.dev.repository.LogRepo;

@Service
public class RegService {
    @Autowired
    private LogRepo userrepo;
    public User reg(String username,String password)
    {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userrepo.save(user);
    }

}
