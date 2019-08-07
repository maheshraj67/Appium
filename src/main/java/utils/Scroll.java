package utils;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.touch.offset.PointOption;

public class Scroll {
	public Point getPoint(WebElement a)
	{
		
		return a.getRect().getPoint();
		
	}
	}
