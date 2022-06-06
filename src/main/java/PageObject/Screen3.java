package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Appdriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screen3 {

	public static AppiumDriver<MobileElement> driver;
	public Screen3() {
		PageFactory.initElements(new AppiumFieldDecorator(Appdriver.getDriver()),this);
	}
	//getting the elements by their X-path////
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement App_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement ActionBar_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement Display_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[4]")
	public MobileElement DisplayTitle_Button;
	
	public void app_btn()
	{
		App_Button.click();
	}
	public void action_bar()
	{
		ActionBar_Button.click();
	}
	public void display_option()
	{
		Display_Button.click();
	}
	public void Title_btn()
	{
		DisplayTitle_Button.click();
		Assert.assertTrue(DisplayTitle_Button.isDisplayed());
	}
}
