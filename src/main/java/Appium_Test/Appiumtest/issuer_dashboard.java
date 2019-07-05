package Appium_Test.Appiumtest;

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

public class issuer_dashboard {
	//TouchAction touchAction = new TouchAction(driver);
	public issuer_dashboard(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        TouchAction touchAction = new TouchAction(driver);
    } catch (Exception e) {

        e.printStackTrace();
    }
}
    //**Issue Open, Completed, closed, All
	
	@AndroidFindBy(id = "layoutopenissues")
	public WebElement open_issue;

	@AndroidFindBy(id = "layoutcomplete")
	public WebElement issuer_complete_issue;

	@AndroidFindBy(id = "layoutclosed")
	public WebElement issuer_open_issues;
	
	@AndroidFindBy(id = "layouttabdocuments")
	public WebElement issuer_closed_issue;
	
	@AndroidFindBy(id = "layoutall")
	public WebElement issuer_all_issue;
	
	
	//**Plus icon in issuer page
	
	@AndroidFindBy(id = "fabaddform")
	public WebElement issuer_add_issue;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='tvlocname']")
	public WebElement location;
	
	//**Creating issue page
	
	@AndroidFindBy(id = "issuename")
	public WebElement issuer_issue_name;
	
	@AndroidFindBy(id = "layoutDepartment")
	public WebElement issuer_department;
	
	
	@AndroidFindBy(id = "photo1")
	public WebElement issuer_photo1;
	
	@AndroidFindBy(id = "btnsubmit")
	public WebElement submit;
	
	@AndroidFindBy(id = "ivback")
	public WebElement back_button;
	
	
	//**Popup screen to end add issue page
	
	@AndroidFindBy(id = "android:id/button2")
	public WebElement no;
	@AndroidFindBy(id = "android:id/button1")
	public WebElement yes;
	
	
	//**Issuer menu list items
	
	@AndroidFindBy(id = "tvmenuhead")
	public WebElement Issuer_menu_head;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Change PIN']")
	public WebElement issuer_change_pin;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Dashboard']")
	public WebElement issuer_dashboard;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Select Site']")
	public WebElement issuer_select_site;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Contact Support']")
	public WebElement issuer_contact_support;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Logout']")
	public WebElement issuer_logout;
	
	@AndroidFindBy(id = "version")
	public WebElement issuer_app_version;
	
	//**Issue details page
	
	@AndroidFindBy(id = "quickaction2")
	public WebElement issuer_Change_status;
	
	@AndroidFindBy(id = "sendcomment")
	public WebElement issuer_send_comment;
	
	@AndroidFindBy(id = "editText")
	public WebElement issuer_Type_text;
	
	@AndroidFindBy(id = "ivexpclose")
	public WebElement issuer_view_issue;
	
	//**issue more option
	
	@AndroidFindBy(id = "More options")
	public WebElement issuer_more_option;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share Issuee']")
	public WebElement issuer_share_issue;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Due Date']")
	public WebElement issuer_change_duedate;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Status']")
	public WebElement issuer_change_status;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Re-Assign Issuee']")
	public WebElement issuer_reassign;
	
	
	
	@AndroidFindBy(id = "tvdept")
	public WebElement reassign_department;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='General']")
	public WebElement issuer_depatment_general;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='House keeping']")
	public WebElement issuer_depatment2;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Maintainance']")
	public WebElement issuer_depatment3;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='compliance']")
	public WebElement issuer_depatment4;
	
	@AndroidFindBy(id = "com.pazo.ppz:id/submit")
	public WebElement issuer_department_submit;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Duplicate']")
	public WebElement issuer_duplicate;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Completed']")
	public WebElement issuer_completed;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deferred']")
	public WebElement issuer_deferred;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Close']")
	public WebElement issuer_close;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reopen']")
	public WebElement issuer_reopen;
	
	
	
	public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
}
	
	
	public void issuer_raise_issue() throws Exception {
	  
	}

         /* code for raise issue*/
	
	}
	

