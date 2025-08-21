import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
//        Thread.sleep(5000);

        //using ID
//        driver.findElement(By.id("user-name")).sendKeys("automated-eg@yahoo.com");
//        driver.findElement(By.id("password")).sendKeys("HelloWorld");

        //using name
//        driver.findElement(By.name("user-name")).sendKeys("dasd@tt.com");

        // using cssSelector
//        driver.findElement(By.cssSelector("#user-name")).sendKeys("232323@tt.com");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1");

        // by className
//        driver.findElement(By.className("form_group")).sendKeys("2");

        // by XPath
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("dsad@@##");




        Thread.sleep(3000);
        driver.quit();
        System.out.println("Done");


    }
}
