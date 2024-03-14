package com.example.leena.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Login() {
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
@Id
 private String username;
 private String password;
public Login(String username, String password) {
    this.username = username;
    this.password = password;
} 

}