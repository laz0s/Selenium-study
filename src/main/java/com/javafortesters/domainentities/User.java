package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;
import com.javafortesters.myownexceptions.InvalidPassword;

public class User extends TestAppEnv{
    protected String username;
    protected String password;

    public User(){
        this.username = "Username";
        this.password = "p@ssw0rd";
    }

    public User(String un, String pw) throws InvalidPassword{
        if (pw.length() <= 7){
            throw new InvalidPassword("Password should be > 7 characters");
        }
        this.username = un;
        this.password = pw;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPermission(){
        return "Normal";
    }

    public void setUsername(String un){
        this.username = un;
    }

    public void setPassword(String pw) throws InvalidPassword{

        if (pw.length() <= 7){
            throw new InvalidPassword("Password should be > 7 characters");
        }
        this.password = pw;
    }
}
