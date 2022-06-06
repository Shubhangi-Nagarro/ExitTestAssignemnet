package Runner;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Listeners({ ExtentITestListenerClassAdapter.class })
@CucumberOptions(features = "C:/Users/shubhangiusrate/eclipse-workspace/ExitTestAssignment/src/test/java/Features", glue = {
		"StepDefination", "Hooks" }, tags = { "@tag" })
public class runner extends AbstractTestNGCucumberTests {

}
