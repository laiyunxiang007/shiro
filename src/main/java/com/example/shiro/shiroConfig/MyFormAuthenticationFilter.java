package com.example.shiro.shiroConfig;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//登录成功后跳转页面
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    // 制定session跳转url
    private final String successUrl = "/index.html";

    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        WebUtils.issueRedirect(request, response,successUrl);
        return false;
    }



}
