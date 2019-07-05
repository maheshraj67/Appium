package Appium_Test.Appiumtest;

import java.sql.Connection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Appium_utils {
	/*public Appium_utils(AppiumDriver<MobileElement>driver){
		try {
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        TouchAction touchAction = new TouchAction(driver);
	    } catch (Exception e) {

	        e.printStackTrace();
	    }
	}*/
	private static AndroidDriver driver;
	
	public void scroll_list(List<WebElement> a ){
		Scroll b =new Scroll();
		Point p1=b.getPoint(a.get(a.size()-1));
		Point p2=b.getPoint(a.get(0));
		new TouchAction(driver)
		.press(PointOption.point(p1.x, p1.y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
		.moveTo(PointOption.point(p2.x, p2.y)).release().perform();
	}
	public enum Connection {
	    ALL, AIRPLANE, NONE, WIFI;
	}
	
/*public void connection1(){

    driver.setConnection(Connection.ALL); 
    System.out.println(driver.getConnection()); 

    driver.toggleWifi();

   driver.setConnection(); 
    System.out.println(driver.getConnection()); 
driver.set


   driver.setConnection(Connection.NONE); 
    System.out.println(driver.getConnection()); 



   driver.setConnection(Connection.WIFI); 
    System.out.println(driver.getConnection()); 
}*/
	
	
	//*****Swipe swipe(driver,DIRECTION.RIGHT);
	
	
	public enum DIRECTION {
	    DOWN, UP, LEFT, RIGHT, LEFT_MENU;
	}
	
	public static void swipe(AndroidDriver driver, DIRECTION direction, long duration) {
	    Dimension size = driver.manage().window().getSize();

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (direction) {
	        case RIGHT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.90);
	            endX = (int) (size.width * 0.05);
	            new TouchAction<>(driver)
	                    .press(PointOption.point(startX, startY))
	                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
	                    .moveTo(PointOption.point(endX, startY))
	                    .release()
	                    .perform();
	            break;

	        case LEFT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.15);
	            endX = (int) (size.width * 0.90);
	            new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

	            break;
	            
	        case LEFT_MENU:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.05);
	            endX = (int) (size.width * 0.90);
	            new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

	            break;

	      /*  case UP:
	            endY = (int) (size.height * 0.70);
	            startY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
	            break;*/
	            
	        case UP:
	            endY = (int) (size.height * 0.70);
	            startY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
	            break;


	        case DOWN:
	            startY = (int) (size.height * 0.70);
	            endY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

	            break;

	    }
	}
			

}
