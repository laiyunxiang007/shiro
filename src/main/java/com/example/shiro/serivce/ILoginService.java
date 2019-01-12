package com.example.shiro.serivce;

import com.example.shiro.mapper.UserMapper;
import com.example.shiro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ILoginService{

    @Autowired
    private UserMapper userMapper;


    public User findByName(String name) {
       return userMapper.findByName(name);
    }
}
