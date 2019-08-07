package Appium_Test.Appiumtest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
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

import Appium_Test.Appiumtest.Issue;
import Appium_Test.Appiumtest.Issue_chat_page;
import Appium_Test.Appiumtest.Login_poi;
import Appium_Test.Appiumtest.Multisite_dashboard;
import Appium_Test.Appiumtest.New_issue_page;
import Appium_Test.Appiumtest.Site_dashboard_poi;
//import pom.Prog1;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import utils.ReadToastMessage;


public class issue_create {
static AndroidDriver driver;

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
	 capabilities.setCapability("appActivity", "com.tagtual.trackd.Activities.Splash");
	 capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
	  capabilities.setCapability("unicodeKeyboard", true);
	 capabilities.setCapability("resetKeyboard", true);
	 try{
	 //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	 }
	 catch (ExceptionInInitializerError error){
	        System.out.println(error.getCause());
	        System.out.println(error.getMessage());
	        System.out.println(error.getLocalizedMessage());
	        System.out.println(error.getStackTrace().toString());

	    }
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 //driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	// Thread.sleep(10000);
	
}

@Test(priority=0)
public void Issue_raised() throws Exception {
	Login_poi log = new Login_poi((AppiumDriver)driver);
	Site_dashboard_poi sd= new Site_dashboard_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Issue is=new Issue((AppiumDriver) driver);
	New_issue_page ns=new New_issue_page((AppiumDriver)driver);
	ReadToastMessage rtm=new ReadToastMessage();
	Thread.sleep(2000);
	log.login("Automation_Field_user@gmail.com", "123456789");
	ms.select_site(0);
	
	Thread.sleep(2000);
	sd.click_plus();
	sd.click_raise_issue();
	is.select_location();
	Thread.sleep(2000);
	ns.click_issue_name();
	ns.enter_issue_name("hi fool");
	ns.click_departemnt();
	ns.select_department(0);
	ns.click_user();
	ns.select_user(0);
	ns.submit_issue();
    String xml1 = driver.getPageSource();
	
	String str=rtm.imageconversion(driver);
	if(str.contains("Issuee has been Submitted") )
		System.out.println("Issue submitted");
	else
		System.out.println("Issue not submitted");
	
	
}

@Test(priority=1)
public void Issue_raised_without_name() throws Exception {
	Login_poi log = new Login_poi((AppiumDriver)driver);
	Site_dashboard_poi sd= new Site_dashboard_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Issue is=new Issue((AppiumDriver) driver);
	New_issue_page ns=new New_issue_page((AppiumDriver)driver);
	ReadToastMessage rtm=new ReadToastMessage();
	Thread.sleep(2000);
	log.login("Automation_Field_user@gmail.com", "123456789");
	ms.select_site(0);
	
	Thread.sleep(2000);
	sd.click_plus();
	sd.click_raise_issue();
	is.select_location();
	Thread.sleep(2000);
	//ns.click_issue_name();
	//ns.enter_issue_name("hi fool");
	ns.click_departemnt();
	ns.select_department(0);
	ns.click_user();
	ns.select_user(0);
	String str=rtm.imageconversion(driver);
	ns.submit_issue();
	String str1=rtm.imageconversion(driver);
	ns.submit_issue();
	String str2=rtm.imageconversion(driver);
	ns.submit_issue();
	String str3=rtm.imageconversion(driver);
	ns.submit_issue();
	
	String str4=rtm.imageconversion(driver);
	if(str1.contains("Enter Issuee Name") )
		System.out.println("Pass");
	else if(str2.contains("Enter Issuee Name") )
		System.out.println("pass");
	else if(str3.contains("Enter Issuee Name") )
		System.out.println("pass");
	else
		System.out.println("fail");
		
	
	
}

@Test(priority=2)
public void Issue_raised_without_department() throws Exception {
	Login_poi log = new Login_poi((AppiumDriver)driver);
	Site_dashboard_poi sd= new Site_dashboard_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Issue is=new Issue((AppiumDriver) driver);
	New_issue_page ns=new New_issue_page((AppiumDriver)driver);
	ReadToastMessage rtm=new ReadToastMessage();
	Issue_chat_page ic=new Issue_chat_page((AppiumDriver)driver);
	Thread.sleep(2000);
	log.login("Automation_Field_user@gmail.com", "123456789");
	ms.select_site(0);
	
	Thread.sleep(2000);
	sd.click_plus();
	sd.click_raise_issue();
	is.select_location();
	Thread.sleep(2000);
	ns.click_issue_name();
	ns.enter_issue_name("hi fool");
	//ns.click_departemnt();
	//ns.select_department(0);
	ns.click_user();
	ns.select_user(0);
	String str=rtm.imageconversion(driver);
	ns.submit_issue();
	String str1=rtm.imageconversion(driver);
	ns.submit_issue();
	String str2=rtm.imageconversion(driver);
	ns.submit_issue();
	String str3=rtm.imageconversion(driver);
	ns.submit_issue();
	
	String str4=rtm.imageconversion(driver);
	if(str1.contains("Assign a DEPARTMENTT") )
		System.out.println("Pass");
	else if(str2.contains("Assign a DEPARTMENTT") )
		System.out.println("pass");
	else if(str3.contains("Assign a DEPARTMENTT") )
		System.out.println("pass");
	else
		System.out.println("fail");
}

@Test(priority=3 )
public void Issue_reassign() throws Exception {
	Login_poi log = new Login_poi((AppiumDriver)driver);
	Site_dashboard_poi sd= new Site_dashboard_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Issue is=new Issue((AppiumDriver) driver);
	New_issue_page ns=new New_issue_page((AppiumDriver)driver);
	ReadToastMessage rtm=new ReadToastMessage();
	Issue_chat_page ic=new Issue_chat_page((AppiumDriver)driver);
	Thread.sleep(2000);
	//log.login("Automation_Field_user@gmail.com", "123456789");
	log.email_page();
	log.enter_email("Automation_Field_user2@gmail.com");
	log.enter_pass("123456789");
	log.click_submit();
	Thread.sleep(2000);
	//ms.select_site(0);
	
	Thread.sleep(2000);
	sd.click_issue();
	//try{
	//if(is.error_mesage().contains("No assigned issuee found"))
	//System.out.println("No issues in the list");
	//}
	//catch (NoSuchElementException e) {
		is.click_issue_inList(0);
		Thread.sleep(2000);
		//ic.QAassign_user();
	//}
		ic.click_more_option1();
		Thread.sleep(2000);
		//ic.QAassign_user();
		Thread.sleep(2000);
		ic.click_issue_reassign();
		ic.click_reassign_department();
		ic.select_department(0);
		Thread.sleep(4000);
		//driver.findElementByXPath("android.widget.TextView[(@text='Select User')]").click();
		ic.click_issue_user1();
		String usern=ic.user_name.get(0).getText();
		ic.select_user(0);
		
		//String sss= appends(usern+" Has been assigned")
				String ss=usern.concat(" has been assigned the Issuee");
				System.out.println(usern.concat(" has been assigned the Issuee"));
		ic.click_reassign_submit();
		Thread.sleep(1000);
		String str1=rtm.imageconversion(driver);
		
	//System.out.println(str1);
		if(str1.contains(ss) )
			System.out.println("Pass");
		
		else
			System.out.println("fail");
		
		}
	

@Test(enabled = false)
public void Issue_change_status() throws Exception {
	Login_poi log = new Login_poi((AppiumDriver)driver);
	Site_dashboard_poi sd= new Site_dashboard_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Issue is=new Issue((AppiumDriver) driver);
	New_issue_page ns=new New_issue_page((AppiumDriver)driver);
	ReadToastMessage rtm=new ReadToastMessage();
	Issue_chat_page ic=new Issue_chat_page((AppiumDriver)driver);
	Thread.sleep(2000);
	//log.login("Automation_Field_user@gmail.com", "123456789");
	log.email_page();
	log.enter_email("Automation_Field_user@gmail.com");
	log.enter_pass("123456789");
	log.click_submit();
	Thread.sleep(2000);
	ms.select_site(0);
	System.out.println("hello");
	Thread.sleep(2000);
	sd.click_issue();
	if(is.error_mesage().contains("No assigned issuee found")){
	System.out.println("No issues in the list");}
	else {
		is.click_issue_inList(0);
		Thread.sleep(2000);
		//ic.QAassign_user();
		
		ic.click_more_option1();
		Thread.sleep(2000);
		//ic.QAassign_user();
		Thread.sleep(2000);
		ic.click_issue_reassign();
		ic.click_reassign_department();
		ic.select_department(0);
		Thread.sleep(4000);
		//driver.findElementByXPath("android.widget.TextView[(@text='Select User')]").click();
		ic.click_issue_user1();
		ic.select_user(1);
		ic.click_reassign_submit();
		
		//ic.change_statusF();
		}
	
	
	
	
	/*String str4=rtm.imageconversion(driver);
	if(str1.contains("Assign a DEPARTMENTT") )
		System.out.println("Pass");
	else if(str2.contains("Assign a DEPARTMENTT") )
		System.out.println("pass");
	else if(str3.contains("Assign a DEPARTMENTT") )
		System.out.println("pass");
	else
		System.out.println("fail");*/
}

@AfterMethod
public void teardown(){
	//close the app
	driver.quit();
}
}