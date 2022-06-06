package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Appdriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screen2 {
	public static AppiumDriver<MobileElement> driver;
	public Screen2() {
		PageFactory.initElements(new AppiumFieldDecorator(Appdriver.getDriver()),this);
	}
	//getting the elements by their X-path//
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement Animation_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	public MobileElement HideShow_Button;
	
	@FindBy(xpath="	/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.CheckBox[1]")
	public MobileElement CheckBox_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public MobileElement Numbers_Button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button")
	public MobileElement Show_Button;
	
	
    public void  animation() 
    {
    	Animation_Button.click();
    }
    public void hideshow()
    {
    	HideShow_Button.click();
    }
    public void checkbox()
    {
    	CheckBox_Button.click();
    }
    public void number()
    {
    	Numbers_Button.click();
    }
    public void showbtn()
    {
    	Show_Button.click();
    	Assert.assertTrue(Show_Button.isDisplayed());
    }
    
}
