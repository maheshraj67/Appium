package Appium_Test.Appiumtest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import Appium_Test.Appiumtest.Login_poi;
public class Issue_chat_page {
	//static WebDriver driver;
	public Issue_chat_page(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
    } catch (Exception e) {

        e.printStackTrace();
    }
}
	
	@AndroidFindBy(id ="More options")
	private WebElement issue_more_option;
	public void click_more_option(){
		issue_more_option.click();
	}
	
	@AndroidFindBy(xpath ="//*[@content-desc='More options']")
	private WebElement issue_more_option1;
	public void click_more_option1(){
		issue_more_option1.click();
	}
	
	@AndroidFindBy(id ="title")
	private List<WebElement> issue_reassign;
	public void click_issue_reassign(){
		issue_reassign.get(0).click();
	}
	
	@AndroidFindBy(id ="title")
	private List<WebElement> issue_change_duedate;
	public void click_issue_change_duedate(){
		issue_change_duedate.get(2).click();
	}
	
	@AndroidFindBy(id = "title")
	private List<WebElement> change_status1;
	public void click_issue_change_status(){
		change_status1.get(1).click();
	}
	
	@AndroidFindBy(id = "title")
	private List<WebElement> share_issue;
	public void click_share_issue(){
		share_issue.get(3).click();
	}
	
	
	//click Select Department Dropdown while reassign issue
	@AndroidFindBy(id = "tvdept")
	public WebElement reassign_department;
	public void click_reassign_department(){
		reassign_department.click();
	}
	
	@AndroidFindBy(id = "reportname")
	public List<WebElement> department_name;
	public void select_department(int a){
		department_name.get(a).click();
	}
	
	
	
	
	//click Select User Dropdown while reassign issue
	@AndroidFindBy(id ="tvlicence")
	public WebElement issue_user;
	public void click_issue_user(){
		issue_user.click();
	}
	@AndroidFindBy(id ="licimageView")
	public WebElement issue_user1;
	public void click_issue_user1(){
		issue_user.click();
	}
	@AndroidFindBy(id ="reportname")
	public List<WebElement> user_name;
	public void select_user(int a){
		user_name.get(a).click();
	}
	
	
	@AndroidFindBy(id ="submit")
	public WebElement reassign_submit;
	public void click_reassign_submit(){
		reassign_submit.click();
	}
	
	@AndroidFindBy(id ="acceptIssue")
	public WebElement accept_issue;
	public void click_accept_issue(){
		accept_issue.click();
	}
	
	@AndroidFindBy(id ="editText")
	public WebElement add_comment;
	public void click_add_comment(){
		add_comment.click();
	}
	public void fill_add_comment(String a){
		add_comment.sendKeys(a);
	}
	
	@AndroidFindBy(id = "sendcomment")
	public WebElement send_button;
	public void click_send_button(){
		send_button.click();
	}
	
	@AndroidFindBy(id = "ivexpclose")
	public WebElement view_issue;
	public void click_view_issue(){
		view_issue.click();
	}
	
	@AndroidFindBy(id = "quickaction2")
	public WebElement issue_change_status;
	public void QAchange_status(){
		issue_change_status.click();
		 
	}
	
	@AndroidFindBy(id ="reportname")
	public List<WebElement> change_status;
	public void select_status(int a){
		change_status.get(a).click();
	}
	
	
	@AndroidFindBy(id = "quickaction1")
	public WebElement issue_assign_user;
	public void QAassign_user(){
		issue_assign_user.click();
		 
	}
	
	@AndroidFindBy(id="ivback")
	private WebElement back;
	public void click_back(){
		back.click();
	}
	
	@AndroidFindBy(id = "android:id/button1")
	public WebElement back_yes;
	public void click_yes(){
		back_yes.click();
	}
	
	@AndroidFindBy(id = "android:id/button2")
	public WebElement back_no;
	public void click_no(){
		back_no.click();
	}
	
	@AndroidFindBy(id="issuetitle")
	private WebElement issue_title_read;
	public String get_issue_title(){
		String str=issue_title_read.getText();
		return str;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Completed']")
	public WebElement issue_completed;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deferred']")
	public WebElement issue_deferred;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Close']")
	public WebElement issue_close;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reopen']")
	public WebElement issue_reopen;
	
	
public void change_statusF(){
	QAassign_user();
	click_reassign_department();
	select_department(0);
	click_issue_user();
	select_user(1);
	click_reassign_submit();
		
	}
	
	
	
	
}