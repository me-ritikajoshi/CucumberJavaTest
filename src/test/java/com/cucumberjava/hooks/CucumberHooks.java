package com.cucumberjava.hooks;

import com.cucumberjava.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {

    @Before("@ui")
    public void setUp() {
        DriverFactory.createDriver();
    }

    @After("@ui")
    public void tearDown(Scenario scenario) {
        try {
            WebDriver driver = DriverFactory.getDriver();
            if (scenario.isFailed() && driver instanceof TakesScreenshot screenshotCapableDriver) {
                byte[] screenshot = screenshotCapableDriver.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "failure-screenshot");
            }
        } catch (Exception ignored) {
            // Screenshot capture should never hide the real test failure.
        } finally {
            DriverFactory.quitDriver();
        }
    }
}
