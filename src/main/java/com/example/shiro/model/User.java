package com.example.shiro.model;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class User {
    private Integer id;

    private String username;

    private String password;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}