package com.nahongxudev.javadev;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nahongxu on 2016/6/14.
 */
public class FirstTest {

    @Test
    public void test(){
        String a="hello";
        System.out.println(a);
        Assert.assertEquals("hello",a);
    }
}
