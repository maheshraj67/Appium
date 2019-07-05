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

public class Site_dashboard_poi {
	//TouchAction touchAction = new TouchAction(driver);
	public Site_dashboard_poi(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        TouchAction touchAction = new TouchAction(driver);
    } catch (Exception e) {

        e.printStackTrace();
    }
}

	@AndroidFindBy(id = "layouttabSchedules")
	public WebElement schedules;
	
	public void click_schedule()
	{
		schedules.click();
	}

	@AndroidFindBy(id = "layouttabMessages")
	public WebElement task;
	
	public void click_task()
	{
		task.click();
	}
	

	@AndroidFindBy(id = "layouttabopenissues")
	public WebElement open_issues;
	
	public void click_openissue()
	{
		open_issues.click();
	}
	
	@AndroidFindBy(id = "layouttabdocuments")
	public WebElement documents;
	
	public void click_documents()
	{
		documents.click();
	}
	
	@AndroidFindBy(id = "laymsgs")
	public WebElement lay_message;
	
	public void click_message()
	{
		lay_message.click();
	}
	
	@AndroidFindBy(id = "layissues")
	public WebElement lay_issue;
	
	public void click_issue()
	{
		lay_issue.click();
	}
	
	@AndroidFindBy(id = "laychecklist")
	public WebElement lay_checklist;
	
	public void click_checklist()
	{
		lay_checklist.click();
	}
	
	@AndroidFindBy(id = "ivPrio")
	public List<WebElement> submit_schedule;
	
	public void click_checklist_schedule(int a)
	{
		submit_schedule.get(a).click();
	}
	
	@AndroidFindBy(id = "drafts")
	public WebElement drafts;
	
	public void click_drafts()
	{
		schedules.click();
	}
	
	@AndroidFindBy(id = "tvdraftcount")
	public WebElement draft_count;
	
	@AndroidFindBy(id = "checklists")
	public WebElement all_checklist;
	
	public void click_allchecklist()
	{
		all_checklist.click();
	}
	
	@AndroidFindBy(id = "botchecklistcancel")
	public WebElement cancel;
	
	public void click_cancel()
	{
		cancel.click();
	}
	 
	 @AndroidFindBy(id="tvback")
	 private WebElement loc_back;
	 public void click_locback(){
		 loc_back.click();
	 }
	 
	 
	@AndroidFindBy(id = "laynotifications")
	public WebElement notification;
	
	public void click_notification()
	{
		notification.click();
	}
	
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup[2]/"
			+ "android.widget.ImageButton")
	public WebElement plus;
	
	public void click_plus()
	{
		plus.click();
	}
	
	@AndroidFindBy(id = "fab_shift")
	public WebElement plus_start_shift;
	
	public void click_start_shift()
	{
		plus_start_shift.click();
	}
	
	@AndroidFindBy(id = "fab_scanqrnfc")
	public WebElement plus_scanqr;
	
	@AndroidFindBy(id = "fab_issue")
	public WebElement plus_raise_issue;
	
	public void click_raise_issue()
	{
		plus_raise_issue.click();
	}
	
	@AndroidFindBy(id = "fab_newmessage")
	public WebElement plus_message;
	
	public void click_new_message()
	{
		plus_message.click();
	}
	
	@AndroidFindBy(id = "fab_checklist")
	public WebElement plus_submit_checklist;
	
	public void click_submit_checklist()
	{
		plus_submit_checklist.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.pazo.ppz:id/tvsitename']")
	public WebElement android;
	
	//**Site dashboard Schedule,flags, comments,missed, review pending**
	
	@AndroidFindBy(id = "pb")
	public WebElement today_status;
	
	public void click_today_status()
	{
		today_status.click();
	}
	
	@AndroidFindBy(id = "tvtodays")
	public WebElement status_percentage;
	
	
	@AndroidFindBy(id = "layoutflags")
	public WebElement flags;
	
	public void click_flags()
	{
		flags.click();
	}
	
	@AndroidFindBy(id = "tvflagscount")
	public WebElement flags_count;
	
	@AndroidFindBy(id = "layoutmissed")
	public WebElement missed;
	
	public void click_missed()
	{
		missed.click();
	}
	
	@AndroidFindBy(id = "tvmissedcount")
	public WebElement missed_count;
	
	@AndroidFindBy(id = "layoutcomments")
	public WebElement comments;
	
	public void click_comments()
	{
		comments.click();
	}
	
	@AndroidFindBy(id = "tvcommentscount")
	public WebElement comments_count;
	
	@AndroidFindBy(id = "layoutreviewpending")
	public WebElement review_pending;
	
	public void click_review_pending()
	{
		review_pending.click();
	}
	
	
	@AndroidFindBy(id = "tvreviewpendingcount")
	public WebElement review_pending_count;
	
	//**filter icon in site dashboard** 
	
	@AndroidFindBy(id = "laydeptfilter")
	public WebElement filter;
	
	public void click_Filter()
	{
		filter.click();
	}
	
	@AndroidFindBy(xpath = "android.widget.CheckBox[(@text='House keeping')")
	public WebElement filter_check;
	@AndroidFindBy(id = "tvOk")
	public WebElement filter_ok;
	
	//refresh button in site dashboard
	@AndroidFindBy(id = "layrefresh")
	public WebElement refresh;
	
	public void click_refresh()
	{
		refresh.click();
	}
	
	/*@AndroidFindBy(xpath = "android.widget.ImageButton[(@index='12')]")
	public WebElement plus;*/
	
	@AndroidFindBy(id = "com.pazo.pp/burgerlayout")
	@AndroidFindBy(id = "com.pazo.ppz:id/btnburger")
	@AndroidFindBy(xpath = "android.widget.Button[(@index='1')]")
	public WebElement menu;
	
	public void click_menu()
	{
		menu.click();
	}
	
	@AndroidFindBy(id = "com.pazo.ppz:id/version")
	public WebElement version;
	
	@AndroidFindBy(id = "com.pazo.ppz:id/tvmenuhead")
	public WebElement active_site;
	
	
	
	
	public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
}
	
	
	public void start() throws Exception {
		//WebDriver wait = new WebDriver();
       
		android.click();
		
		schedules.click();
		task.click();
		open_issues.click();
		documents.click();
		
	   
		
		plus.click();
		plus_start_shift.click();
		
		plus.click();
		plus_start_shift.click();
		
	}


	
	}
	

