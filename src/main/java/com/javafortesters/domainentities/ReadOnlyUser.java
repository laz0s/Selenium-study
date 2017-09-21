package com.javafortesters.domainentities;

import com.javafortesters.myownexceptions.InvalidPassword;

public class ReadOnlyUser extends User {

    public ReadOnlyUser(){};

    public ReadOnlyUser(String un, String pw) throws InvalidPassword {
        super(un, pw);
    }

    @Override
    public String getPermission() {
        return "ReadOnly";
    }
}
