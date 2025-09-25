package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PetstoreTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Automatically download and set up the ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser session started.");
    }

    @Test
    public void petstoreCheckoutTest() {
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");

        // Navigate to Fish and add an item
        driver.findElement(By.xpath("//div[@id='SidebarContent']//a[contains(text(),'Fish')]")).click();
        System.out.println("Clicked on Fish category.");
        driver.findElement(By.xpath("//a[contains(text(),'FI-SW-01')]")).click();
        System.out.println("Selected a Fish item.");
        driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]")).click();
        System.out.println("Added Fish to cart.");

        // Navigate to Dogs and add another item
        driver.findElement(By.xpath("//div[@id='SidebarContent']//a[contains(text(),'Dogs')]")).click();
        System.out.println("Clicked on Dogs category.");
        driver.findElement(By.xpath("//a[contains(text(),'K9-BD-01')]")).click();
        System.out.println("Selected a Dog item.");
        driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]")).click();
        System.out.println("Added Dog to cart.");

        // Proceed to checkout
        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
        System.out.println("Clicked on Checkout.");

        // Log in
        driver.findElement(By.name("username")).sendKeys("j2ee");
        driver.findElement(By.name("password")).sendKeys("j2ee");
        driver.findElement(By.name("signon")).click();
        System.out.println("Signed in successfully.");

        // Confirm the order
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        System.out.println("Continued to order confirmation.");
        driver.findElement(By.xpath("//a[contains(text(),'Confirm')]")).click();
        System.out.println("Confirmed the order.");

        // Assert for success message
        boolean isOrderPlaced = driver.findElement(By.xpath("//li[contains(text(),'Thank you')]")).isDisplayed();
        if (isOrderPlaced) {
            System.out.println("Order placed successfully!");
        }
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser session closed.");
        }
    }
}