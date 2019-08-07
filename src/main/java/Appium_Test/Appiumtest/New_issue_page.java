package Appium_Test.Appiumtest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class New_issue_page {
	
	
		//static WebDriver driver;
		public New_issue_page(AppiumDriver<MobileElement> driver) {
			try {
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        
	    } catch (Exception e) {

	        e.printStackTrace();
	    }
	}
	
	
	@AndroidFindBy(id = "issuename")
	private WebElement issue_name1;
	public void click_issue_name(){
		issue_name1.click();
	}
	public void enter_issue_name(String a){
		issue_name1.sendKeys(a);
	}
	
	@AndroidFindBy(id = "location")
	private WebElement location;
	public void click_location(){
	location.click();
	}
		
	@AndroidFindBy(id = "tvlocname")
	public List<WebElement> location_name;
	public void select_location(int a){
		location_name.get(a).click();
		 
	}
	
	@AndroidFindBy(id = "layoutDepartment")
	private WebElement department;
	public void click_departemnt(){
		department.click();
	}
	
	@AndroidFindBy(id = "reportname")
	private List<WebElement> department_name;
	public void select_department(int a){
		department_name.get(a).click();
	}
	
	@AndroidFindBy(id = "layoutLicence")
	private WebElement user1;
	public void click_user(){
		user1.click();
	}
	
	@AndroidFindBy(id = "btnsubmit")
	private WebElement submit1;
	public void submit_issue(){
		submit1.click();
	}
	
	public void select_user(int a){
		department_name.get(a).click();
	}
			
			
		 
	}


