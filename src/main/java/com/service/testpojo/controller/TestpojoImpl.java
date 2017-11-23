package com.service.testpojo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-23T14:50:25.271Z")

@RpcSchema(schemaId = "testpojo")
public class TestpojoImpl implements Testpojo{

    @Autowired
    private TestpojoDelegate testpojoDelegate;


    public String helloworld(String name) {

        return testpojoDelegate.helloworld(name);
    }

}
