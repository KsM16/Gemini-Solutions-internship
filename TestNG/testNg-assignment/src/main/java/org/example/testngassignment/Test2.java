package org.example.testngassignment;

import org.testng.annotations.Test;

public class Test2 {

    @Test(priority = 1, groups = {"FirstTasks"})
    public void login(){
        System.out.println("I have logged-in");
    }

    @Test(priority = 2)
    public void work(){
        System.out.println("doing my work");
    }
    @Test(priority = 3)
    public void exit(){
        System.out.println("Log-out");
    }
}
