package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Appdriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screen4 {

	public static AppiumDriver<MobileElement> driver;
	public Screen4() {
		PageFactory.initElements(new AppiumFieldDecorator(Appdriver.getDriver()),this);
	}
	//getting the elements by their X-path////
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]")
	public MobileElement View_Bttn;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement Animationview_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement Transition_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")
	public MobileElement Lake_Button;
	
	public void view_btn()
	{
		View_Bttn.click();
	}
	public void view_animation_btn()
	{
		Animationview_Button.click();
	}
	public void transition_btn()
	{
		Transition_Button.click();
	}
	public void lake_tahoe()
	{
		Lake_Button.click();
		Assert.assertTrue(Lake_Button.isDisplayed());
	}
}
