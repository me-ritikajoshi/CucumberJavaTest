package com.cucumberjava.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationSteps {

    private final Map<String, String> credentialStore = new HashMap<>();
    private boolean authenticated;
    private String authenticatedUser;

    @Given("a registered user with username {string} and password {string}")
    public void aRegisteredUserWithUsernameAndPassword(String username, String password) {
        credentialStore.put(username, password);
    }

    @When("the user authenticates with username {string} and password {string}")
    public void theUserAuthenticatesWithUsernameAndPassword(String username, String password) {
        String expectedPassword = credentialStore.get(username);
        authenticated = expectedPassword != null && expectedPassword.equals(password);
        authenticatedUser = authenticated ? username : null;
    }

    @Then("authentication should be successful")
    public void authenticationShouldBeSuccessful() {
        Assert.assertTrue("Expected authentication to succeed", authenticated);
    }

    @Then("authentication should fail")
    public void authenticationShouldFail() {
        Assert.assertFalse("Expected authentication to fail", authenticated);
    }

    @Then("the authenticated username should be {string}")
    public void theAuthenticatedUsernameShouldBe(String expectedUsername) {
        Assert.assertEquals("Authenticated username mismatch", expectedUsername, authenticatedUser);
    }
}
