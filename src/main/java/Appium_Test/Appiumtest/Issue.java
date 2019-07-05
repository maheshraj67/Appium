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
public class Issue {
	//static WebDriver driver;
	public Issue(AppiumDriver<MobileElement> driver) {
		try {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
    } catch (Exception e) {

        e.printStackTrace();
    }
}

	
	@AndroidFindBy(id = "layissues")
	private WebElement lay_issue;
	
	public void click_issue()
	{
		lay_issue.click();
	}
	
	@AndroidFindBy(id = "fabaddform")
	public WebElement add_issue;
	
	public void click_add_issue() 
	{
	add_issue.click();
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[(@Text='Beta_domeon')]")
	public WebElement location;
	@AndroidFindBy(id = "tvlocname")
	public WebElement location1;
	
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
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[(@resource-id='com.pazo.ppz:id/issuename')]")
	@AndroidFindBy(id = "issuename")
	private WebElement issue_name1;
	public void enter_issue_name(String a){
		issue_name1.sendKeys(a);
	}
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[(@resource-id='com.pazo.ppz:id/layoutDepartment')]")
	public WebElement department;
	@AndroidFindBy(id = "layoutDepartment")
	public WebElement department1;
	public void click_department(){
		department1.click();
	}
	
	@AndroidFindBy(id = "reportname")
	public List<WebElement> department_name;
	public void select_department(int a){
		department_name.get(a).click();
	}
	
	public void select_user(int a){
		department_name.get(a).click();
	}
	

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[(@resource-id='com.pazo.ppz:id/layoutLicence')]")
	public WebElement user;
	@AndroidFindBy(id = "layoutLicence")
	public WebElement user1;
	public void click_user(){
		user1.click();
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Field_user B')]")
	public WebElement user_name;
	
	@AndroidFindBy(xpath = "//android.widget.Button[(@resource-id='com.pazo.ppz:id/btnsubmit')]")
	public WebElement submit;
	@AndroidFindBy(id = "btnsubmit")
	public WebElement submit1;
	public void submit_issue(){
		submit1.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='House keeping')]")
	public WebElement department_name1;
	
	
		
	@AndroidFindBy(id = "sendcomment")
	public WebElement issue_send_comment;
	
	@AndroidFindBy(id = "editText")
	public WebElement issue_Type_text;
	
	@AndroidFindBy(id = "ivexpclose")
	public WebElement issue_view_issue;
	
	//**issue more option
	
	@AndroidFindBy(id = "More options")
	public WebElement issue_more_option;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share Issuee']")
	public WebElement issue_share_issue;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Due Date']")
	public WebElement issue_change_duedate;
	
	/*@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Status']")
	public WebElement issue_change_status;*/
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Re-Assign Issuee']")
	public WebElement issue_reassign;
	
	
	
	@AndroidFindBy(id = "tvdept")
	public WebElement reassign_department;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='General']")
	public WebElement issue_depatment_general;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='House keeping']")
	public WebElement issue_depatment2;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Maintainance']")
	public WebElement issue_depatment3;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='compliance']")
	public WebElement issue_depatment4;
	
	@AndroidFindBy(id = "submit")
	public WebElement issue_department_submit;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Duplicate']")
	public WebElement issue_duplicate;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Completed']")
	public WebElement issue_completed;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deferred']")
	public WebElement issue_deferred;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Close']")
	public WebElement issue_close;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reopen']")
	public WebElement issue_reopen;
	
	@AndroidFindBy(id="ivfilter")
	private WebElement Issue_page_filter;
	public void click_filter(){
		Issue_page_filter.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
	public WebElement more_option;
	public void click_more_option(){
		more_option.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='My Issuess']")
	public WebElement my_issue;
	public void click_my_issue(){
		my_issue.click();
	}
	
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc='Dept Issuess']")
	public WebElement dept_issue;
	public void click_dept_issue(){
		dept_issue.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Raised by Me']")
	public WebElement raise_by_me;
	public void click_raise_by_me(){
		raise_by_me.click();
	}
	
	@AndroidFindBy(id="tvIStitle")
	public List<WebElement> Issue_Title;
	public void issue_Title(int a){
		Issue_Title.get(a).click();
	}
	
	@AndroidFindBy(id="ivexpclose")
	private WebElement View_issue;
	public void click_view_issue(){
		View_issue.click();
	}
	
	@AndroidFindBy(id="ivback")
	private WebElement back;
	public void click_back(){
		back.click();
	}
	
	@AndroidFindBy(id="issuetitle")
	private WebElement issue_title_read;
	public String get_issue_title(){
		String str=issue_title_read.getText();
		return str;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Status']")
	@AndroidFindBy(id = "quickaction2")
	public WebElement issue_change_status;
	public void change_status(){
		issue_change_status.click();
		 
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Assign User']")
	@AndroidFindBy(id = "quickaction1")
	public WebElement issue_assign_user;
	public void assign_user(){
		issue_assign_user.click();
		 
	}
	
	@AndroidFindBy(id = "linlay")
	public WebElement LocationSearch;
	public void searchlocation(String a){
		LocationSearch.sendKeys(a);
		 
	}
	
	@AndroidFindBy(id = "tvlocname")
	public WebElement location_name;
	public void select_location(){
		location_name.click();
		 
	}
	
	@AndroidFindBy(id = "viewissues")
	public WebElement view_issue;
	public void view_issue_in_raise_issue(){
		view_issue.click();
		 
	}
	
	@AndroidFindBy(id = "btnusethislocation")
	public WebElement click_close;
	public void click_close(){
		click_close.click();
		 
	}
	
	@AndroidFindBy(id = "tvIStitle")
	public List<WebElement> issue_title_in_list;
	public int verify_by_title(String a){
		int b=issue_title_in_list.get(0).getText().compareTo(a);
		 return b;
	}
	
	
	@AndroidFindBy(id = "btnnumber")
	public WebElement due_date_time;
	public void due_date_number(){
		due_date_time.click();
		 
	}
	
	@AndroidFindBy(id = "btnunit")
	public WebElement due_date_unit;
	public void due_date_unit(){
		due_date_unit.click();
		 
	}
	
	@AndroidFindBy(id = "title")
	public List<WebElement> num_title;
	public void select_due_num(int a){
		num_title.get(a).click();
		 
	}
	
	
	
	@AndroidFindBy(id = "photo1")
	public WebElement attach_photo;
	public void add_image_attchment(){
		attach_photo.click();
		 
	}
	
	
	
	
	public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
}
	
	public void issue() throws Exception {
	
	 lay_issue.click();
	 add_issue.click();
	 location1.click();
	 issue_name1.sendKeys("i hate you");
	 department1.click();
	 department_name1.click();
	 user1.click();
	 user_name.click();
	 submit1.click();
	 	
	}

}