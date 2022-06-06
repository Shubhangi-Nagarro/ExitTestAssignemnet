package StepDefination;
import Base.BaseMain;
import PageObject.Screen2;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepDefination2 extends BaseMain{
	
	@Given("^Api demos application is open$")
	public void api_demos_application_is_open() throws Throwable {
		log.info("App launching");
		Applaunch();
	}
	
	@And("^Click on Animation option$")
	public void click_on_Animation_option() throws Throwable {
		log.info("Animation cheching");
		Screen2 sc2= new Screen2();
		sc2.animation();
	}
	
	@And("^Click on Hide_show Animation option$")
	public void click_on_Hide_show_Animation_option() throws Throwable {
		log.info("Hide shoe checking");
		Screen2 sc2= new Screen2();
		sc2.hideshow();
	}
	
	@And("^Click on custom and number button$")
	public void click_on_custom_and_number_button() throws Throwable {
		log.info("Checking of checkbox and number option");
		Screen2 sc2= new Screen2();
		sc2.checkbox();
		sc2.number();
	}
	
	@And("^Click on show button$")
	public void click_on_show_button() throws Throwable {
		log.info("Checking of show button");
		Screen2 sc2= new Screen2();
		sc2.showbtn();
	}

}
