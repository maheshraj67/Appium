package Appium_Test.Appiumtest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
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

//import pom.Prog1;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;


public class Login1 {
public static WebDriver driver;

@BeforeMethod
public void setUp() throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	 File classpathRoot = new File(System.getProperty("user.dir"));
	 File appDir = new File(classpathRoot, "/Apps/Pazo/");
	 File app = new File(appDir, "app-ppz-debug.apk");
	 
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	 capabilities.setCapability("deviceName", "MI");
	 capabilities.setCapability("platformVersion", "7.1.1");
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

@Test(priority =0)
public void testCal_wrongUser_rightPass() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login_UNF("checklist@gmail.com", "123456789");

	if (calPage.VerifyResult("User not found."))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
   
}
@Test(priority =1)
public void Login_incorrecCredentials() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login("Checklist.related@gmail.com", "kvf");

	//if (calPage.VerifyResult("Invalid PIN/Invalid Password"))
		if (calPage.VerifyResult("Invalid Params"))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
   
}
@Test(priority =2)
public void loginWithValidCredentials() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login("Checklist.related@gmail.com", "123456789");
	/*calPage.email_page();
	calPage.enter_email("email");
	calPage.enter_pass("pass");
	calPage.click_submit();*/
	
	Thread.sleep(2000);
	

	if (calPage.VerifyResult("Invalid Params"))
		System.out.println("FAILED Test");
	else
		System.out.println("PASSED Test");
   
}

@Test(priority =2)
public void loginWithValodEmail_InvalidPass() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login("Checklist.related@gmail.com", "12345");
	/*calPage.email_page();
	calPage.enter_email("email");
	calPage.enter_pass("pass");
	calPage.click_submit();*/
	
	Thread.sleep(2000);
	

	if (calPage.VerifyResult("Invalid PIN/Invalid Password"))
		System.out.println("FAILED Test");
	else
		System.out.println("PASSED Test");
   
}


@AfterMethod
public void teardown(){
	//close the app
	driver.quit();
}
}