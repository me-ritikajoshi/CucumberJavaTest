package com.cucumberjava.steps;

import com.cucumberjava.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UiLoginSteps {

    private LoginPage loginPage;

    @Given("the user is on the practice test login page")
    public void theUserIsOnThePracticeTestLoginPage() {
        loginPage = new LoginPage();
        loginPage.open();
    }

    @When("the user submits username {string} and password {string}")
    public void theUserSubmitsUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
        Assert.assertTrue("Login success message was not visible", loginPage.isSuccessVisible());
    }

    @Then("the user should remain on the login page")
    public void theUserShouldRemainOnTheLoginPage() {
        boolean stillOnLoginPage = loginPage.getCurrentUrl().contains("practice-test-login");
        Assert.assertTrue("User was unexpectedly redirected away from login page", stillOnLoginPage);
        Assert.assertFalse("Success message should not be visible for invalid credentials", loginPage.isSuccessVisible());
    }
}
