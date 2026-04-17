package com.cucumberjava.pages;

import com.cucumberjava.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By submitButton = By.id("submit");
    private final By successHeader = By.xpath("//h1[contains(.,'Logged In Successfully')]");

    public LoginPage() {
        this.driver = DriverFactory.getDriver();
    }

    public void open() {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }

    public boolean isSuccessVisible() {
        return !driver.findElements(successHeader).isEmpty() && driver.findElement(successHeader).isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
