package Appium_Test.Appiumtest;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Appium_Test.Appiumtest.Appium_utils.DIRECTION;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Submit_checklist {

static AndroidDriver driver;

@BeforeMethod
public void setup() throws Exception{
	 File classpathRoot = new File(System.getProperty("user.dir"));
	 File appDir = new File(classpathRoot, "/Apps/Pazo/");
	 File app = new File(appDir, "app-ppz-debug.apk");
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	 capabilities.setCapability("deviceName", "MI");
	 capabilities.setCapability("platformVersion", "7.0");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("app", app.getAbsolutePath());
	 capabilities.setCapability("appPackage", "com.pazo.ppz");
	 capabilities.setCapability("appPackage1", "com.google.android.packageinstaller");
	 capabilities.setCapability("appActivity", "com.tagtual.trackd.Activities.Splash");
	 capabilities.setCapability("appActivity1", "com.tagtual.trackd.Activities.LicenceLogin");
	 capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
	 capabilities.setCapability("unicodeKeyboard", true);
	 capabilities.setCapability("resetKeyboard", true);
	 try{
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 }
	 catch (ExceptionInInitializerError error){
	        System.out.println(error.getCause());
	        System.out.println(error.getMessage());
	        System.out.println(error.getLocalizedMessage());
	        System.out.println(error.getStackTrace().toString());

	    }
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	// Thread.sleep(10000);
	
}

@Test
public void submit_check() throws Exception{
	int count=0;
	Login_poi log=new Login_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Site_dashboard_poi sd=new Site_dashboard_poi((AppiumDriver)driver);
	Appium_utils au=new Appium_utils();
	Checklist_page cp=new Checklist_page((AppiumDriver) driver);
	
	log.email_page();
	log.enter_email("Checklist.related@gmail.com");
	log.enter_pass("123456789");
	log.click_submit();
	ms.select_site(0);
	
	
	

	
	//System.out.println(sd.submit_schedule.size());
	//for (int i=0;i<=sd.submit_schedule.size()-1; i++){
	//sd.click_checklist_schedule(1);
	//if(sd.submit.isEmpty()==false)
	//sd.click_submit();
	
	//else
		//sd.click_locback();
	    //System.out.printf("With location checklist ",++count);
	//}
	sd.click_checklist_schedule(1);
	cp.click_submit();
	sd.click_refresh();

}
}
