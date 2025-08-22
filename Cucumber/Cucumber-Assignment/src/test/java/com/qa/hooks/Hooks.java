package com.qa.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void set() {
        System.out.println("set the environment");
    }

    @After
    public void remove() {
        System.out.println("remove the environment");
    }
}