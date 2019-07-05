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

//import pom.Prog1;
import io.appium.java_client.android.AndroidDriver;


public class issue_create {
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
public void testCal() throws Exception {
	Login_poi calPage = new Login_poi((AppiumDriver)driver);
	 
	calPage.login("checklist.related@gmail.com", "123456789");
     Issue d=new Issue((AppiumDriver) driver);
     List<MobileElement> site=driver.findElements(By.id("com.pazo.ppz:id/tvsitename"));
     System.out.println(site.size());
     site.get(2).click();
     Thread.sleep(2000);
     d.issue();



   
}


@AfterMethod
public void teardown(){
	//close the app
	driver.quit();
}
}