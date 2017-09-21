package com.javafortesters.chap012inheritance.examples;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.ReadOnlyUser;
import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class Inheritance {
    @Test
    public void canGetUrlByUserObject(){
        User user = new User();
        Assert.assertEquals("http://192.123.0.3:67", user.getUrl());

    }
    @Test
    public void canGetPermissions(){
        User user = new User();
        AdminUser admin = new AdminUser();
        ReadOnlyUser roUser = new ReadOnlyUser();

        Assert.assertEquals(user.getUsername(), admin.getUsername());
        Assert.assertEquals(user.getPassword(), admin.getPassword());
        Assert.assertEquals(user.getUsername(), roUser.getUsername());
        Assert.assertEquals(user.getPassword(), roUser.getPassword());

        Assert.assertEquals("Normal", user.getPermission());
        Assert.assertEquals("Elevated", admin.getPermission());
        Assert.assertEquals("ReadOnly", roUser.getPermission());

    }

    @Test
    public void assertThatFunctionality(){
        Assert.assertThat(3+3, is(6));
        Assert.assertThat(6, equalTo(6));
        Assert.assertThat(6, not(7));
        Assert.assertThat("My name is Lazaros", containsString("me is Laz"));
        Assert.assertThat("My name is Lazaros", endsWith("aros"));
        Assert.assertThat("My name is Lazaros", startsWith("My "));

        String x = null;
        Assert.assertThat(x, is(nullValue()));

        int y = 125;

        Assert.assertThat(y, is(not(nullValue())));
        Assert.assertThat(y, is(notNullValue()));
    }
}
