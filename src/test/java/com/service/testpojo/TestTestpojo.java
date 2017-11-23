package com.service.testpojo.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestpojo {

    TestpojoDelegate testpojoDelegate = new TestpojoDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testpojoDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
