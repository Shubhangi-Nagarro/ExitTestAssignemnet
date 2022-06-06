package StepDefination;
import Base.BaseMain;
import PageObject.Screen3;
import PageObject.Screen4;
import PageObject.Screen5;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination4 extends BaseMain{
	
	@Given("^user is in the api app$")
	public void user_is_in_the_api_app() throws Throwable {
		log.info("App is staring");
         Applaunch();
		
	}
	
	@And("^Click on view option$")
	public void click_on_view_option() throws Throwable {
		log.info("View option is getting checking");
		Screen4 sc4= new Screen4();
		sc4.view_btn();
	}
	
	@And("^Click on animation option$")
	public void click_on_animation_option() throws Throwable {
		log.info("Checking for animation");
		Screen4 sc4= new Screen4();
		sc4.view_animation_btn();
	}
	
	@And("^Click on Third_D Tansition$")
	public void click_on_Third_D_Tansition() throws Throwable {
		log.info("3D tansition checking");
		Screen4 sc4= new Screen4();
		sc4.transition_btn();
	}

	
	@And("^Click on lake Tahoe$")
	public void click_on_lake_Tahoe() throws Throwable {
		log.info("Lake tahoe checking");
		Screen4 sc4= new Screen4();
		sc4.lake_tahoe();
	}
	
	@Then("^Exit app$")
	public void exit_app() throws Throwable {
		log.info("App closed");
		closeapp();
	}
	
	@And("^Click on graphics option$")
	public void click_on_graphics_option() throws Throwable {
		log.info("Checking for graphicsand bitmeshmap");
		Screen5 sc5= new Screen5();
		sc5.graphics_option();
		sc5.bitmeshmap_option();
	}

}
