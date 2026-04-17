package com.cucumberjava.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ui",
        glue = "com.cucumberjava",
        monochrome = true,
        tags = "@ui and not @wip",
        plugin = {
                "pretty",
                "summary",
                "html:target/cucumber-reports/ui-cucumber.html",
                "json:target/cucumber-reports/ui-cucumber.json",
                "junit:target/cucumber-reports/ui-cucumber.xml"
        }
)
public class UiTestRunner {
}
