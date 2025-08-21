import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        try {
            // Incorrect locator that will throw NoSuchElementException
            WebElement element = driver.findElement(By.id("wrong-username"));
            element.sendKeys("test");
        } catch (NoSuchElementException e) {
            System.out.println("Error occurred: " + e.getMessage());


            Thread.sleep(3000);
            driver.quit();
        }
    }
}
