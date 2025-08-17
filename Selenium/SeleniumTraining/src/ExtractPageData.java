import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExtractPageData {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        // fill username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //fill password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //clicking
        driver.findElement(By.id("login-button")).click();


        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("total links : " + link.size());

        for (WebElement l : link){
            System.out.println(l);
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
