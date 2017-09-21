package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.myownexceptions.InvalidPassword;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class UserTest {
    @Test
    public void canConstructANewUser(){
        User user = new User();

        Assert.assertEquals("Default username should be initialized", "Username", user.getUsername());
        Assert.assertEquals("Default password should be initialized", "p@ssw0rd", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = null;
        try {
            user = new User("admin", "pA55w0rD");
        } catch (InvalidPassword invalidPassword) {
            invalidPassword.printStackTrace();
        }
        Assert.assertEquals("given username expected", "admin", user.getUsername());
        Assert.assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        try {
            user.setPassword("PaZZwor6");
        } catch (InvalidPassword invalidPassword) {
            invalidPassword.printStackTrace();
        }
        Assert.assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }

    @Test
    public void collections(){
        Collection<String> workdays = new ArrayList<String>();
        Collection<String> daysOfWeek = new ArrayList<String>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        Assert.assertEquals(5, workdays.size());

        daysOfWeek.addAll(workdays);
        Assert.assertEquals( workdays.size(), daysOfWeek.size() );
        Assert.assertTrue( daysOfWeek.containsAll(workdays ));
    }

    @Test
    public void listOfUsers(){
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        User user2 = new User();

        users.add(user1);
        users.add(0,user2);

        Assert.assertEquals(0, users.indexOf(user2));
        Assert.assertEquals(1, users.indexOf(user1));

        users.remove(0);

        Assert.assertEquals(0, users.indexOf(user1));
    }

    @Test
    public void setOfUsers(){
        Set<User> users = new HashSet<User>();
        User user1 = new User();

        users.add(user1);
        users.add(user1);
        users.add(user1);

        Assert.assertEquals(1, users.size());
    }

    @Test
    public void mapOfUsers(){
        Map<String,User> users = new HashMap<String, User>();
        User user1 = new User();
        User user2 = new User();

        users.put("larry",user1);
        users.put("larry",user2);

        Assert.assertEquals(1, users.size());
    }
}
