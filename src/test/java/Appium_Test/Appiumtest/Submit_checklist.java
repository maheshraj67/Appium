package Appium_Test.Appiumtest;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import utils.Appium_utils;
import utils.ReadToastMessage;
import utils.Appium_utils.DIRECTION;

public class Submit_checklist {

static AndroidDriver driver;
/*Login_poi log=new Login_poi((AppiumDriver)driver);
Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
Site_dashboard_poi sd=new Site_dashboard_poi((AppiumDriver)driver);
Appium_utils au=new Appium_utils();
Checklist_page cp=new Checklist_page((AppiumDriver) driver);*/

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
	 Login_poi log=new Login_poi((AppiumDriver)driver);
		Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
		Site_dashboard_poi sd=new Site_dashboard_poi((AppiumDriver)driver);
		Appium_utils au=new Appium_utils();
		Checklist_page cp=new Checklist_page((AppiumDriver) driver);
	// Thread.sleep(10000);
	
}

@Test(priority=1)
public void submit_checklist_main_dashboard() throws Exception{
	int count=0;
	Login_poi log=new Login_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Site_dashboard_poi sd=new Site_dashboard_poi((AppiumDriver)driver);
	Appium_utils au=new Appium_utils();
	Checklist_page cp=new Checklist_page((AppiumDriver) driver);
	ReadToastMessage rtm=new ReadToastMessage();
	
	log.email_page();
	log.enter_email("Automation_Field_user@gmail.com");
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
	sd.click_checklist_schedule(0);
	cp.click_submit();
String xml1 = driver.getPageSource();
	
	String str=rtm.imageconversion(driver);
	if(str.contains("Checklist has been Submitted") )
		System.out.println("checklist submitted");
	else
		System.out.println("checklist not submitted");
	
	//sd.click_refresh();

}
@Test(priority=0)
public void submit_checklist_in_plus_button()throws Exception{
	//String yourToastMessage="Checklist has been Submitted";
	Login_poi log=new Login_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Site_dashboard_poi sd=new Site_dashboard_poi((AppiumDriver)driver);
	Appium_utils au=new Appium_utils();
	 ReadToastMessage rtm=new ReadToastMessage();
	Checklist_page cp=new Checklist_page((AppiumDriver) driver);
	log.email_page();
	log.enter_email("Automation_Field_user@gmail.com");
	log.enter_pass("123456789");
	log.click_submit();
	//rtm.readToastMessage(driver);
	ms.select_site(0);
	sd.click_plus();
	sd.click_submit_checklist();
	
	Thread.sleep(1000);
	cp.click_submit_checklist(0);
	Thread.sleep(1000);
	cp.click_submit();
	
	String xml1 = driver.getPageSource();
	
	String str=rtm.imageconversion(driver);
	if(str.contains("Checklist has been Submitted") )
		System.out.println("checklist submitted");
	else
		System.out.println("checklist not submitted");
	//System.out.println(au.isChecklistSubmitted(driver));
	/*if(au.isChecklistSubmitted(driver))
		System.out.println("checklist submitted");
	else
		System.out.println("checklist not submitted");*/
	//String xmlFormat = driver.getPageSource();
	//Thread.sleep(100);
	//String xmlFormat1 = driver.getPageSource();
	//Thread.sleep(100);
	//if(xmlFormat.contains("yourToastMessage")){
	//System.out.println("Toast message displayed: "+yourToastMessage);
	//}
	
}


@Test(priority=2)
public void submit_checklist_without_internet1()throws Exception{
	Login_poi log=new Login_poi((AppiumDriver)driver);
	Multisite_dashboard ms=new Multisite_dashboard((AppiumDriver)driver);
	Site_dashboard_poi sd=new Site_dashboard_poi((AppiumDriver)driver);
	Issue is =new Issue((AppiumDriver)driver);
	Appium_utils au=new Appium_utils();
	Checklist_page cp=new Checklist_page((AppiumDriver) driver);
	ReadToastMessage rtm=new ReadToastMessage();
	log.email_page();
	log.enter_email("Automation_Field_user@gmail.com");
	log.enter_pass("123456789");
	log.click_submit();
	ms.select_site(0);
	driver.toggleWifi();
	sd.click_plus();
	sd.click_submit_checklist();
	cp.click_submit_checklist(0);
	cp.click_submit();
String xml1 = driver.getPageSource();
	
	String str=rtm.imageconversion(driver);
	if(str.contains("Checklist has been Submitted") )
		System.out.println("checklist submitted");
	else
		System.out.println("checklist not submitted");
	sd.click_refresh();
	//sd.click_menu();
	au.swipe(driver, DIRECTION.LEFT_MENU, 1000);
	Thread.sleep(2000);
	sd.click_logout();
	String err=sd.get_errormessage();
	if (log.VerifyResult("err"))
		System.out.println("PASSED Test");
	else
		System.out.println("FAILED Test");
	
}

}
