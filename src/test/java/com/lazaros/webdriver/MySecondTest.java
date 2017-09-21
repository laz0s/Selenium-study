package com.lazaros.webdriver;

import org.junit.Assert;
import org.junit.Test;

public class MySecondTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2 + 2;
        Assert.assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canRemoveTwoOutOfTwo(){
        int answer = 2 - 2;
        Assert.assertEquals("2+2=4", 0, answer);
    }

    @Test
    public void canDevideFourFromTwo(){
        int answer = 4 / 2;
        Assert.assertEquals("2+2=4", 2, answer);
    }

    @Test
    public void canMultiplyTwoAndTwo(){
        int answer = 2 * 2;
        Assert.assertEquals("2+2=4", 4, answer);
    }
}
