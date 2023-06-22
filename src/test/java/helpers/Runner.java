package helpers;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features", 
        glue = {""},
        plugin = {"pretty","json:target/cucumber.json","html:target/report/report.html"},
        monochrome = true
)

public class Runner {
}
