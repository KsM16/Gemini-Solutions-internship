package com.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/qa/features",
        glue = {"com.qa.steps", "com.qa.hooks"},
        tags = "@sample",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class Runner {
}
