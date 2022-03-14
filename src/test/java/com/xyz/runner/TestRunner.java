package com.xyz.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/xyz",
        tags = "@chicken",
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests{
}
