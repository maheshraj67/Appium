
 
 
 
 package Appium_Test.Appiumtest; 
 
 
 
import io.appium.java_client.android.AndroidDriver; 
 
 
 
import java.io.File; 
 import java.net.MalformedURLException; 
 import java.net.URL; 
 import java.util.concurrent.TimeUnit; 
 
 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities; 
 import org.openqa.selenium.support.ui.WebDriverWait; 
 import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest; 
 
 
 
public class AppiumDriverBase { 
 
 
 
    protected WebDriver driver; 
     protected WebDriverWait wait; 
     // before Test Annotation makes a java function to run every time before a TestNG test case 
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
 
 
 
 
 
 
      // After Test Annotation makes a java function to run every time after a TestNG test case 
     @AfterTest 
     public void afterTest() { 
 
 
 
       // quit the driver 
        driver.quit(); 
     } 
 
 
 
} 