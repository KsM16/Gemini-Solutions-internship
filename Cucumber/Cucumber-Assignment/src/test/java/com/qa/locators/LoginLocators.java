package com.qa.locators;

import org.openqa.selenium.By;

public class LoginLocators {
    public static final By USERNAME_FIELD = By.name("username");
    public static final By PASSWORD_FIELD = By.name("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By DASHBOARD_HEADER = By.xpath("//h6[text()='Dashboard']");
//    public static final By USER_PROFILE = By.className("oxd-userdropdown-name");

//    public static final By USER_PROFILE = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > p");
public static final By USER_PROFILE = By.xpath("//p[@class='oxd-userdropdown-name']");
}
