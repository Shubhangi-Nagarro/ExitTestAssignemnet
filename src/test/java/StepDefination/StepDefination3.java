package StepDefination;
import Base.BaseMain;
import PageObject.Screen3;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination3 extends BaseMain{
	
	@Given("^Click on app option$")
	public void click_on_app_option() throws Throwable {
		log.info("App is starting");
		Applaunch();
	    Screen3 sc3= new Screen3();
	    sc3.app_btn();
	}
	
	@And("^Click on action_bar and on the display option$")
	public void click_on_action_bar_and_on_the_display_option() throws Throwable {
		log.info("Checking for action bar and display");
		Screen3 sc3= new Screen3();
		sc3.action_bar();
		sc3.display_option();
	}
	
	@Then("^Click on the Display_Show_title option$")
	public void click_on_the_Display_Show_title_option() throws Throwable {
		log.info("Display show title");
		Screen3 sc3= new Screen3();
		sc3.Title_btn();
	}

}
