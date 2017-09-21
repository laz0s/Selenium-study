package com.javafortesters.chap011exceptions.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.myownexceptions.InvalidPassword;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionHandling {
    @Test
    public void throwANullPointerException(){
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }
        String yourAge = "You are " + ageAsString + " years old";
        Assert.assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age=null;
        age.toString();
    }

    @Test(expected = InvalidPassword.class)
    public void setPasswordWithFewCharacters()  {
        User user = new User();
        user.setPassword("1234567");


    }
}
