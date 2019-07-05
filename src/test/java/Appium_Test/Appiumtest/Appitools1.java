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

import com.applitools.eyes.appium.Eyes;

//import pom.Prog1;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Appitools1 {
static WebDriver driver;

@BeforeMethod
public void setUp() throws MalformedURLException, InterruptedException{
	Eyes eyes = new Eyes();
    // This is your api key, make sure you use it in all your tests.
    eyes.setApiKey("byKtLM9C4cbRSBRzLxZlXbG6psd2LAQVne5JMDT9U108E110");

    // Setup appium - Make sure the capabilities meets your environment.
    // Refer to http://appium.io documentation if required.
    DesiredCapabilities dc = new DesiredCapabilities();
    dc.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.3.4");
    dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
    dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
    dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");

    // The original app from Appium github project.
    dc.setCapability("app", "https://store.applitools.com/download/iOS.TestApp.app.zip");

    IOSDriver<WebElement> driver = new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 	
}

@Test
public void testCal() throws Exception {
	Eyes eyes = new Eyes();
	 eyes.open(driver, "iOS test application", "test");

     // Visual validation point #1
     eyes.checkWindow("Initial view");
     driver.findElement(By.name("TextField1")).sendKeys("3");
     driver.findElement(By.name("TextField2")).sendKeys("5");
     driver.findElement(By.name("ComputeSumButton")).click();
     // Visual validation point #2
     eyes.checkWindow("After compute");

     // End visual UI testing. Validate visual correctness.
     eyes.close();



   
}


@AfterMethod
public void teardown(){
	//close the app
	driver.quit();
}
}