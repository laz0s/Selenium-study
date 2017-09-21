package com.lazaros.webdriver;

import org.junit.Assert;
import org.junit.Test;

public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        Assert.assertEquals("intValue returns correct Value", 4, four.intValue());
        Integer five = new Integer(5);
        Assert.assertEquals("intValue returns correct Value", 5, five.intValue());
    }
}
