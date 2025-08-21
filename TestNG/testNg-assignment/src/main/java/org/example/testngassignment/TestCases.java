package org.example.testngassignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 1)
    public void one() {
        System.out.println("First");
    }

    @Test(priority = 2)
    public void two() {
        System.out.println("Second");
        Assert.assertEquals(1, 2);
    }


    @Test(priority = 3)
    public void teardown() {
        System.out.println("Close");
    }

}
