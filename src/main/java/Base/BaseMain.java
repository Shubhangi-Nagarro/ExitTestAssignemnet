package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseMain {

	public static AppiumDriver<MobileElement> driver;// driver
	public static Logger log = LogManager.getLogger(BaseMain.class.getName());// logger

	//// Screenshot
	public static String ssdir = System.getProperty("user.dir") + "/FailedScreenshots/";

/////Declaring the capabilities//////
	public static DesiredCapabilities caps;

	public static void Applaunch() throws MalformedURLException {

		caps = new DesiredCapabilities(); // caps

		caps.setCapability("platformVersion", "8.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "demo.fun.com.apis");
		caps.setCapability("appActivity", "demo.fun.com.apis.ApiDemos");
		caps.setCapability("app", "C:/Users/shubhangiusrate/Downloads/demo.fun.com.apis-v1.1.apk");
		caps.setCapability("deviceName", "Android");
		
// URL of Appium server
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
// Appdriver
		Appdriver.setDriver(driver);
		System.out.println("Application starting");
		log.info("Application get started");
	}

/////Scroll/////
	public static void scrolldown() {
///storing all the elements in the list present in the MobileElement
		List<MobileElement> lists = driver.findElements(By.xpath("//android.widget.TextView"));
//fetching all the element one by one
		for (MobileElement e : lists)
			System.out.println(e.getAttribute("text"));
//getting the dimension and storing it in the object
		Dimension dime = driver.manage().window().getSize();
//parsing the dimension into int datatype//
		int start_x = (int) (dime.width * 0.5);
		int start_y = (int) (dime.height * 0.7);
		int end_x = (int) (dime.width * 0.2);
		int end_y = (int) (dime.height * 0.1);
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	
//For quit
	public static void closeapp() {
		driver.quit();
	}

	public static AppiumDriver<MobileElement> getDriver() {
		return driver;
	}
}
