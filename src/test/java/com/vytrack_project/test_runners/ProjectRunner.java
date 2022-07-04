package com.vytrack_project.test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/vytrack_project/step_definitions",
        dryRun = false,
        tags = "@Login"

)



public class ProjectRunner {

}