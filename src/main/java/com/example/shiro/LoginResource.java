package com.example.shiro;

import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class LoginResource {
    @Autowired
    private ShiroService shiroService;

    //退出的时候是get请求，主要是用于退出
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    //post登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody Map<String,String> map){
        //添加用户认证信息
    Subject subject = SecurityUtils.getSubject();

    UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
    usernamePasswordToken.setUsername(map.get("username"));
    usernamePasswordToken.setPassword(map.get("password").toCharArray());
    //进行验证，这里可以捕获异常，然后返回对应信息
        System.out.println(usernamePasswordToken.toString());
        subject.login(usernamePasswordToken);
        return "index";
}
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    //登出
    @RequestMapping(value = "/logout")
    public String logout(){
        return "logout";
    }

    //错误页面展示
    @RequestMapping(value = "/error",method = RequestMethod.POST)
    @ResponseBody
    public String error(){
        return "未授权";
    }



    //注解的使用
    @RequiresRoles("admin")
    @RequiresPermissions("create")
    @RequestMapping(value = "/create")
    public String create(){
        return "Create success!";
    }

    @RequestMapping(value = "/a")
    public String a(){
        shiroService.updatePermission();
        return "刷新成功";
    }
}
