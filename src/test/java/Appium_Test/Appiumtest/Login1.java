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


@Test
public void testCal() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login_UNF("checklist@gmail.com", "12345");

	if (calPage.VerifyResult("User not found."))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
   
}
/*@Test
public void testCal2() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login("wctrg@gkjs.com", "kvf");

	if (calPage.VerifyResult("Invalid Params"))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
   
}*/
@Test
public void login() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	calPage.login("Checklist.related@gmail.com", "12345");
	calPage.email_page();
	calPage.enter_email("email");
	calPage.enter_pass("pass");
	calPage.click_submit();
	
	Thread.sleep(2000);
	

	if (calPage.VerifyResult("Invalid Params"))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
   
}


}