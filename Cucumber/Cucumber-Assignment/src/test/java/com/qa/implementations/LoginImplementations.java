package com.qa.implementations;

import com.qa.locators.LoginLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginImplementations {
    public WebDriver driver;
    public WebDriverWait wait;

    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void navigateToLoginPage() {
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterCredentials(String username, String password) throws InterruptedException {

        Thread.sleep(3000);
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLocators.USERNAME_FIELD));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(LoginLocators.PASSWORD_FIELD);
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(LoginLocators.LOGIN_BUTTON));
        loginButton.click();
    }

    public boolean verifyDashboard() {

        WebElement dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLocators.DASHBOARD_HEADER));
        return dashboardHeader.isDisplayed();

    }

    public boolean verifyWelcomeMessage() {

        WebElement userProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLocators.USER_PROFILE));
        return userProfile.isDisplayed();

    }

//    public WebDriver getDriver() {
//        return driver;
//    }

    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
