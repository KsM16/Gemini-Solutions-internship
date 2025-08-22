package com.qa.steps;

import com.qa.implementations.LoginImplementations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginImplementations login = new LoginImplementations();;

     
    @Given("The browser is launched")
    public void theBrowserIsLaunched() {
        login.launchBrowser();
    }

    @And("The user navigates to the login page")
    public void theUserNavigatesToTheLoginPage() {
        login.navigateToLoginPage();
    }

    @When("The user enters valid username and password")
    public void theUserEntersValidUsernameAndPassword() {
        try {
            login.enterCredentials("Admin", "admin123");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @And("Clicks on the login button")
    public void clicksOnTheLoginButton() {
        login.clickLoginButton();
    }

    @Then("The user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
        Assert.assertTrue("User was not redirected to homepage",
                login.verifyDashboard());
    }

    @And("A welcome message should be displayed")
    public void aWelcomeMessageShouldBeDisplayed() {
        Assert.assertTrue("Welcome message ",
                login.verifyWelcomeMessage());
    }


}
 