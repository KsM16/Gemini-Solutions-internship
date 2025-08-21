package org.example.testngassignment;

import org.testng.annotations.Test;

public class Test1 {

    @Test(priority = 1, groups = {"FirstTasks"})
    public void eat(){
        System.out.println("I am eating");
    }

    @Test(priority = 2)
    public void code(){
        System.out.println("doing dev");
    }
    @Test(priority = 3, groups = {"LastTasks"})
    public void sleep(){
        System.out.println("sleeping right now");
    }
}
