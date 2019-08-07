package Appium_Test.Appiumtest;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Checklist_schedule_page {
	//TouchAction touchAction = new TouchAction(driver);
	public Checklist_schedule_page(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        TouchAction touchAction = new TouchAction(driver);
    } catch (Exception e) {

        e.printStackTrace();
    }
}
//Flagged checklist schedule page
	
	@AndroidFindBy(id = "tv_schedulename")
	private List<WebElement> schedules1;
	
	public void click_Flaged_schedule(int a)
	{
		schedules1.get(a).click();
	}
	
	@AndroidFindBy(id = "tvback")
	private WebElement back;
	
	public void click_back()
	{
		back.click();
	}
	
	@AndroidFindBy(id = "flagcell")
	private List<WebElement> flagcell;
	
	public void click_flag_icon(int a)
	{
		flagcell.get(a).click();
	}
	
	@AndroidFindBy(id = "imscheduleInfo")
	private WebElement schedules_info;
	
	public void click_schedule_info()
	{
		schedules_info.click();
	}
	
	@AndroidFindBy(id = "rl_chat")
	private WebElement Comment;
	
	public void click_comment()
	{
		Comment.click();
	}
	
	@AndroidFindBy(id = "editText")
	private WebElement edit_text;
	
	public void type_comment()
	{
		edit_text.sendKeys("Hi");
	}
	
	@AndroidFindBy(id = "sendcomment")
	private WebElement Send_Comment;
	
	public void send_comment()
	{
		Send_Comment.click();
	}
	
	//Comments page
	
	
	@AndroidFindBy(id = "Navigate up")
	private WebElement back1;
	
	public void click_back_fromcomment()
	{
		back1.click();
	}
	
	
	
	
	@AndroidFindBy(id = "tvChecklistName")
	private WebElement Click_review;
	
	public void Click_review()
	{
		Click_review.click();
	}
	
	@AndroidFindBy(xpath = "android.widget.TextView[(@test='Hi')]")
	private WebElement open_comment;
	
	public void open_comment()
	{
		open_comment.click();
	}
}