package Appium_Test.Appiumtest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium_Test.Appiumtest.Login;

//import pom.Prog1;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;


public class start_shift {
static WebDriver driver;

@BeforeMethod
public void setUp() throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
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

@Test(priority=1)
public void testCal() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver )driver);
	 Site_dashboard_poi sd= new Site_dashboard_poi((AppiumDriver) driver);
	 
	 //start shift by field user 
	 calPage.login("checklist.related@gmail.com","123456789");
	 Thread.sleep(2000);
     sd.start();
     
     //start shift by Viewer
    // calPage.login_UNF("checklist.related@gmail.com", "123456789");
    // sd.start();
     
   //start shift by issuer
    // calPage.login_UNF("issuermail@gmail.com", "123456789");
     
     
   //start shift by site admin
     //calPage.login_UNF("checklist.related@gmail.com", "123456789");
     //sd.start();
     
	
   
}
/*@Test(priority=0)
public void testCal2() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	Site_dashboard_poi sd1= new Site_dashboard_poi((AppiumDriver) driver);
	 
	calPage.login_UNF("issuermail@gmail.com", "123456789");
	List<MobileElement> site=driver.findElements(By.id("com.pazo.ppz:id/tvsitename"));
	System.out.println(site.size());
	 site.get(2).click();
	 Thread.sleep(2000);
	if(sd1.plus.isDisplayed()==true)
	   sd1.plus.click();
	else
		System.out.println("He is issuer");
	if (sd1.plus_start_shift.isDisplayed()==true){
		sd1.plus_start_shift.click();
	   System.out.println("Shift started successfully");
	}
	else 
		
	{
		System.out.println("Issuer cannot start shift ");
		driver.quit();
	}
	sd1.plus.click();
	sd1.plus_start_shift.click();
	
}*/
/*@Test
public void testCal3() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login("Checklist.related@gmail.com", "12345");

	/*if (calPage.VerifyResult("Invalid Params"))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
   
}*/

@AfterMethod
public void teardown(){
	//close the app
	driver.quit();
}
}