package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
              (  plugin="pretty" ,
                 monochrome=true ,
                 features="C:\\shailaja\\facebook\\rec\\Login.feature" ,
                 tags="@SmokeTest" ,
                 glue="StepDefinition" )
            		 

public class TestRuner
{

}
