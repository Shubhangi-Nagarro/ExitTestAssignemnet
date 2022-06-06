package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Appdriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screen1 {
	public static AppiumDriver<MobileElement> driver;
	public Screen1() {
		PageFactory.initElements(new AppiumFieldDecorator(Appdriver.getDriver()),this);
	}
	
	//getting the elements by their X-path////
	
	//Accessibility
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement Accessibility_Button;
	
	//Accessibility Node Provider
	@FindBy(xpath="	/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement Accessibility_Node_Button;
	
	public void Done()
	{
		Accessibility_Button.click();
	}
	
	public void Complete()
	{
		Accessibility_Node_Button.click();
		Assert.assertTrue(Accessibility_Node_Button.isDisplayed());
	}

   

}
