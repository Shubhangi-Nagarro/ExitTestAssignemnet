package StepDefination;
import Base.BaseMain;
import PageObject.Screen1;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination1 extends BaseMain{
	
	@Given("^Open the app api demos$")
	public void open_the_app_api_demos() throws Throwable
	{
		log.info("Opening");
		Applaunch();
	}
	
	@And("^Click on accessibility option$")
	public void click_on_accessibility_option() throws Throwable 
	{
   
		log.info("Accessibility checking");
		Screen1 sc1= new Screen1();
		sc1.Done();
	}
	
	@And("^Click on accessibility node provider option$")
	public void click_on_accessibility_node_provider_option() throws Throwable 
	{
		log.info("Accessibility node provider checking");
		Screen1 sc1= new Screen1();
		sc1.Complete();
	}
	
	@Then("^Exit the app$")
	public void exit_the_app() throws Throwable
	{
		log.info("App close");
	closeapp();
	}


}
