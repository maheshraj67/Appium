package Appium_Test.Appiumtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login_poi {

	public Login_poi(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    } catch (Exception e) {

        e.printStackTrace();
    }
}

	@AndroidFindBy(id = "loginemail")
	public WebElement lgn_email;
	
	public void email_page()
	{
		lgn_email.click();
	}

	/*@AndroidFindBy(xpath = "//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etemail')]")
	public WebElement enter_mail;*/
	@AndroidFindBy(id = "etemail")
	private WebElement enter_mail;
	
	public void enter_email(String email)
	{
		enter_mail.sendKeys(email);
	}

	/*@AndroidFindBy(xpath = "//android.widget.EditText[(@resource-id='com.pazo.ppz:id/etpin')]")
	public WebElement enter_pin;*/
	@AndroidFindBy(id = "etpin")
	private WebElement enter_pin;
	
	public void enter_pass(String pass)
	{
		enter_pin.sendKeys(pass);
	}
	
	/*@AndroidFindBy(id = "com.pazo.ppz:id/btnSubmit")
	public WebElement submit;*/
	@AndroidFindBy(id = "btnSubmit")
	private WebElement submit;
	
	public void click_submit()
	{
		submit.click();
	}
	
	@AndroidFindBy(id = "android:id/button1")
	private WebElement ok;
	
	public void click_ok()
	{
		ok.click();
	}
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement ok1;
	
	@AndroidFindBy(id = "forgotpin")
	private WebElement forgot_pin;
	
	public void click_forgot_pin()
	{
		forgot_pin.click();
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
	
	public void login(String num1, String num2) throws Exception {
		
		lgn_email.click();
		enter_mail.sendKeys(num1);
		//enter_mail.
		//txtNum2.sendKeys("(long)7777027702)");
		enter_pin.sendKeys(num2);
		submit.click();
		Thread.sleep(2000);
		ok.click();
		Thread.sleep(2000);
		//ok1.click();
		Thread.sleep(2000);
		//ok1.click();
		//String result=err_msg.getText();
	}
public void login_UNF(String num1, String num2) throws Exception {
		
		lgn_email.click();
		enter_mail.sendKeys(num1);
		//enter_mail.
		//txtNum2.sendKeys("(long)7777027702)");
		enter_pin.sendKeys(num2);
		submit.click();
		Thread.sleep(2000);
		//ok.click();
		Thread.sleep(2000);
		//ok1.click();
		Thread.sleep(2000);
		///ok1.click();
		//String result=err_msg.getText();
	}

	public boolean VerifyResult(String result) {
		if (err_msg.getText().equals(result))
			return true;
		else
			return false;
	}

}