package Runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = "C:\\Users\\prave\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\TestNgCucumber\\src\\main\\resources\\loginform\\loginform.feature",
		
		glue = "Test1"
		)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
