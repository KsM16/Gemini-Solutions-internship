import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitStrategies {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // implicit weight
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(7));
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container"))
        );


        Thread.sleep(3000);
        driver.quit();
        System.out.println("Done");

    }
}
