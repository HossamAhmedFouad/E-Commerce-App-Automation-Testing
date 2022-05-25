package com.ecommerce.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/com/ecommerce/Features",
        glue = {"com.ecommerce.StepDefinitions"},
        tags = "@regression",
        plugin = { "pretty", "html:target/TestReport.html" },
        monochrome = true

)

public class TestRunner{

}
