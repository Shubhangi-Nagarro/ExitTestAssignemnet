package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Appdriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screen5 {
	
	public static AppiumDriver<MobileElement> driver;
	public Screen5() {
		PageFactory.initElements(new AppiumFieldDecorator(Appdriver.getDriver()),this);
	}
	//getting the elements by their X-path////
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement Graphics_Bttn;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button")
	public MobileElement BitMeshMap_Bttn;  ////This have been intentionally failed to take a screenshot////
	
	public void graphics_option()
	{
		Graphics_Bttn.click();
	}
	public void bitmeshmap_option()
	{
		BitMeshMap_Bttn.click();
		
	}
}
