package com.example.shiro.model;

import org.springframework.stereotype.Component;

@Component
public class Permission {
    private Integer id;

    private String pername;

    private Integer roleId;

    private Role role;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername == null ? null : pername.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}