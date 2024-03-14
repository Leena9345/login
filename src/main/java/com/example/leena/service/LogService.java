package com.example.leena.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leena.domain.Login;
import com.example.leena.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;
    public Login log(String username,String password)
    {
        Login user=rep.findByUsernameAndPassword(username,password);
        return user;
    }

}
