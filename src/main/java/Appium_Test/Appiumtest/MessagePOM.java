package Appium_Test.Appiumtest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MessagePOM {

	public MessagePOM(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    } catch (Exception e) {

        e.printStackTrace();
    }
}

	@AndroidFindBy(xpath = "android.support.v7.app.ActionBar$Tab[@content-desc='CHATS']")
	public WebElement chats;
	
	public void click_chats()
	{
		chats.click();
	}
	
	@AndroidFindBy(xpath = "android.support.v7.app.ActionBar$Tab[@content-desc='TASKS']")
	public WebElement task;
	
	public void click_task()
	{
		task.click();
	}

	/*@AndroidFindBy(xpath = "//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etemail')]")
	public WebElement enter_mail;*/
	@AndroidFindBy(id = "newchatgroups")
	private WebElement newChatPlus;
	
	public void clickPlus_newChat()
	{
		newChatPlus.click();
	}

	/*@AndroidFindBy(xpath = "//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etpin')]")
	public WebElement enter_pin;*/
	@AndroidFindBy(id = "searchlayout")
	private WebElement searchLayout;
	
	public void click_search_icon()
	{
		searchLayout.click();
	}
	
	/*@AndroidFindBy(id = "com.pazo.ppz:id/btnSubmit")
	public WebElement submit;*/
	@AndroidFindBy(id = "dotsmenu")
	private WebElement dotsMenu;
	
	public void click_dotsMenu()
	{
		dotsMenu.click();
	}
	
	@AndroidFindBy(id = "tvone")
	private List<WebElement> groupName_userName;
	
	public void click_groupName_userName()
	{
		groupName_userName.get(0).click();
	}
	
	@AndroidFindBy(id = "ivPrio")
	private List<WebElement> chatList;
	
	public void click_inchatList()
	{
		chatList.get(0).click();
	}
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement ok1;
	
	@AndroidFindBy(id = "ivnewtask")
	private WebElement newtask;
	
	public void click_newTask()
	{
		newtask.click();
	}
	
	@AndroidFindBy(id = "etMob")
	public WebElement enter_phone;
	
	public void ener_phone(String phone)
	{
		enter_phone.sendKeys(phone);
	}
	
	@AndroidFindBy(id = "loginpin")
	public WebElement login_pin;
	
	@AndroidFindBy(id = "android:id/message")
	public WebElement err_msg;
	
	public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
}
	
	


}