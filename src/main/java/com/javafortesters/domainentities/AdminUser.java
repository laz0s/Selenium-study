package com.javafortesters.domainentities;

import com.javafortesters.myownexceptions.InvalidPassword;

public class AdminUser extends User {

    public  AdminUser(){};

    public AdminUser(String un, String pw) throws InvalidPassword{
        super(un, pw);
    }

    @Override
    public String getPermission() {
        return "Elevated";
    }
}
