import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dummy {
    public static void main (String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.geeksforgeeks.org/");
//        driver.navigate().to("https://www.tpointtech.com/");

//        driver.quit();
//        driver.manage().window().minimize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));
//        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("clickButton")));
//        clickableElement.click();
        driver.get("https://www.geeksforgeeks.org/");
//        driver.get(String.valueOf(driver.findElement(By.id("userName-label"))));
//        driver.findElement(By.className("form-file-label")).sendKeys("Garbage Val");
//        driver.findElement(By.id("currentAddress-label")).sendKeys("Hellll");
//          driver.findElement(By.id("userNumber")).sendKeys("1234");
//        WebElement link = driver.findElement(By.partialLinkText("DSA"));
//        wait.until(ExpectedConditions.elementToBeClickable(link));
    //        Thread.sleep(10000);
        List<WebElement> content= new ArrayList<>();
        content = driver.findElements(By.tagName("script"));
        System.out.println(content.size());
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
//        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("https://www.geeksforgeeks.org/learn-data-structures-and-algorithms-dsa-tutorial/")));
//        link.click();



    }
}
