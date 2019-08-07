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
import Appium_Test.Appiumtest.Login_poi;
import Base_page.RunOn;
//import pom.Prog1;
import io.appium.java_client.android.AndroidDriver;


public class list_search {
static WebDriver driver;

@BeforeMethod
public void setUp() throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	 RunOn ro=new RunOn();
	 ro.run("AndroidEmulatorNativeApp", "app-VR-debug,apk");
	
}

@Test
public void testCal() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver) driver);
	 
	//calPage.login("checklist.related@gmail.com", "12345");
	 calPage.login("checklist.related@gmail.com", "12345");
Issue d=new Issue((AppiumDriver) driver);


}


@AfterMethod
public void teardown(){
	//close the app
	driver.quit();
}
}