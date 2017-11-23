package com.service.testpojo.controller;

import org.springframework.stereotype.Component;


@Component
public class TestpojoDelegate implements Testpojo {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
