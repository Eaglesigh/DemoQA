package com.demoQA.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/demoQA/stepDefinitions",
        dryRun = false,
        tags = "@Murat",
        publish = true
)

public class CukesRunner {

}
