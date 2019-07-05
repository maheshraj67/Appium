package Appium_Test.Appiumtest;
 
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import Appium_Test.Appiumtest.Scroll;
 
public class Site_list {
 
 private static AndroidDriver driver;
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
 File classpathRoot = new File(System.getProperty("user.dir"));
 File appDir = new File(classpathRoot, "/Apps/Pazo/");
 File app = new File(appDir, "app-ppz-debug.apk");
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 capabilities.setCapability("deviceName", "MI");
 capabilities.setCapability("platformVersion", "5.1.1");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("app", app.getAbsolutePath());
 capabilities.setCapability("appPackage", "com.pazo.ppz");
 capabilities.setCapability("appPackage1", "com.google.android.packageinstaller");
 capabilities.setCapability("appActivity", "com.tagtual.trackd.Activities.Splash");
 capabilities.setCapability("appActivity1", "com.tagtual.trackd.Activities.LicenceLogin");
 capabilities.setCapability("unicodeKeyboard", true);
 capabilities.setCapability("resetKeyboard", true);
 capabilities.setCapability("newCommandTimeout", 10000);
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
	
 Thread.sleep(1000);
/* WebElement phone= driver.findElement(By.id("com.pazoinc.app:id/etMob"));*/
 //MobileElement phone = (MobileElement) driver.findElementByAccessibilityId("com.pazoinc.app:id/etMob");
 //element.sendKeys("Hello world!");

 
// MobileElement phone = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"TOP CHARTS\")");
//Perform the required action on the element)
 //MobileElement phone = (MobileElement) ((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.pazoinc.app:id/etMob\")");
// WebElement phone= driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'loginemail')]");
 //WebElement phone= driver.findElementByName(" Login using your Email Address  ");
// WebElement phone=driver.findElement(By.xpath("//android.widget.EditText[@text='Login using your Email Address']"));
//android.widget.EditText[@index='2']
 MobileElement phone=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@index='5']"));
 phone.click();
 //WebElement phone= driver.findEle
 //phone.sendKeys(String.valueOf("7777027702"));
 //sendKeysINTByJS(driver,phone,7702);
 //System.out.println("Search Box Name - " + phone.getAttribute("name"));
 //WebElement plus=driver.findElement(By.id("com.pazoinc.app:id/etpin"));
 //MobileElement plus = (MobileElement) ((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.pazoinc.app:id/etpin\")");
 //driver.findElementByXPath("//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etemail')]").click();
 MobileElement plus=(MobileElement) driver.findElementByXPath("//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etemail')]");
 //driver.hideKeyboard();
 //plus.click();
 plus.sendKeys("checklist.related@gmail.com");
 
 //driver.findElementByXPath("//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etpin')]").click();
 driver.findElementByXPath("//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etpin')]").sendKeys("123456789");
 //driver.hideKeyboard();
 //plus1.click();
 //plus1.sendKeys("12345");
// phone.sendKeys(String.valueOf("1234"));
 Thread.sleep(3000);
 //WebElement four=driver.findElement(By.id("com.pazoinc.app:id/btnSubmit"));
 //MobileElement four = (MobileElement) ((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.pazoinc.app:id/btnSubmit\")");
//driver.findElementByXPath("//android.widget.EditText[(@resource-id='com.pazo.ppz:id/btnSubmit')]").click();
//driver.findElementByXPath("//android.widget.EditText[(@text='Login')]").click();
driver.findElement(By.id("com.pazo.ppz:id/btnSubmit")).click();
String str2=driver.currentActivity();
System.out.println(str2);
//driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").click();
//driver.findElementByXPath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']").click();
String str1=driver.currentActivity();
System.out.println(str1);
//driver.findElementByXPath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']").click();
//List<MobileElement> a=(MobileElement) driver.findElementsByXPath("//android.widget.TextView[@resource-id='com.pazo.ppz:id/tvsitename']");
//List<WebElement> site=(WebElement)driver.findElementsId("com.pazo.ppz:id/tvsitename");
List<MobileElement> site=driver.findElements(By.id("com.pazo.ppz:id/tvsitename"));
System.out.println(site.size());
 
/*TouchAction ta = new TouchAction(driver);
ta.press(PointOption.point(445, 1677)).moveTo(PointOption.point(471,1017)).release().perform();*/
Scroll a =new Scroll();
int count=0;
//for(int i=0;i<2;i++){
Point p1=a.getPoint(site.get(site.size()-1));
Point p2=a.getPoint(site.get(0));
new TouchAction<>(driver)
.press(PointOption.point(p1.x, p1.y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
.moveTo(PointOption.point(p2.x, p2.y)).release().perform();
//List<WebElement> general1=driver.findElements(By.id("com.pazo.ppz:id/tvsitename"));
count=count+site.size();


//}
	System.out.println(count);
	driver.findElement(By.id("com.pazo.ppz:id/burgerlayout")).click();

	} 
	
}
	   
//else System.out.println("Element.getText1()");
	
	
 //four.click();
 //driver.quit();
 
// }
 
 
	
 
 
