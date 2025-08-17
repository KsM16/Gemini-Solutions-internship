import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInteraction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        // fill username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //fill password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //clicking
        driver.findElement(By.id("login-button")).click();


        WebElement element = driver.findElement(By.cssSelector(".title"));
        if (element.getText().equals("Products")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        Thread.sleep(3000);
         driver.quit();

    }
}

