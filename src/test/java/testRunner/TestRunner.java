package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/resources/features",
            glue = "tests",
            monochrome = true,
            plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}
    )
    class TestsRunner {

    }


