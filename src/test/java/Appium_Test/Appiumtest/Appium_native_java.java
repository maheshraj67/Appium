package Appium_Test.Appiumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import com.applitools.eyes.selenium.Eyes;

public class Appium_native_java {

    public static void main(String[] args) throws Exception {

        // Set desired capabilities.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File classpathRoot = new File(System.getProperty("user.dir"));
   	 File appDir = new File(classpathRoot, "/Apps/Pazo/");
   	 File app = new File(appDir, "app-ppz-debug.apk");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
   	 capabilities.setCapability("deviceName", "MI");
   	 capabilities.setCapability("platformVersion", "7.0");
   	 capabilities.setCapability("platformName", "Android");
   	 capabilities.setCapability("app", app.getAbsolutePath());
   	 capabilities.setCapability("appPackage", "com.pazo.ppz");
   	// capabilities.setCapability("appPackage1", "com.google.android.packageinstaller");
   	 capabilities.setCapability("appActivity", "com.tagtual.trackd.Activities.Splash");
   	// capabilities.setCapability("appActivity1", "com.tagtual.trackd.Activities.LicenceLogin");
   	 capabilities.setCapability("unicodeKeyboard", true);
   	 capabilities.setCapability("resetKeyboard", true);


        // Open the app.
        WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        // Initialize the eyes SDK and set your private API key.
        Eyes eyes = new Eyes();
        eyes.setApiKey("byKtLM9C4cbRSBRzLxZlXbG6psd2LAQVne5JMDT9U108E110");

        eyes.setForceFullPageScreenshot(true);

        try {

            // Start the test.
            eyes.open(driver, "Contacts!", "My first Appium native Java test!");

            // Visual validation.
            eyes.checkWindow("Contact list!");

            // End the test.
            eyes.close();

        } finally {

            // Close the app.
            driver.quit();

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();

        }

    }

}
