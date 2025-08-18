import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement((By.xpath("//*[@id=\"password\"]"))).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".submit-button.btn_action")).click();


        WebElement dropDown = driver.findElement(By.cssSelector(".product_sort_container"));
        Select select = new Select(dropDown);


        //1st selection
        Thread.sleep(3000);
        select.selectByIndex(0);
        System.out.println("Seleted  : Name (A to Z)");


        // 2nd selection
        Thread.sleep(2000);
        dropDown = driver.findElement(By.cssSelector(".product_sort_container"));
        select = new Select(dropDown);

        select.selectByValue("hilo");
        System.out.println("Selected : Price (high to low)");


        // 3rd selection
        Thread.sleep(2000);
        dropDown = driver.findElement(By.cssSelector(".product_sort_container"));
        select = new Select(dropDown);

        select.selectByVisibleText("Price (low to high)");
        System.out.println("Selected : Price (low to high)");


        Thread.sleep(3000);
        driver.quit();
        System.out.println("Done");

    }
}
