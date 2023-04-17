package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before //cucumber
    public void setUp(){
        System.out.println("This is coming from Before");
    }

    @After //cucumber
    public void tearDown(){
        System.out.println("This is coming from After");
    }
    @Before("@db")
    public void setUpDB(){
        System.out.println("This is coming from Before DB");
        System.out.println("Connecting DataBase");
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("This is coming from After DB");
        System.out.println("Disconnecting DataBase");
    }
}
