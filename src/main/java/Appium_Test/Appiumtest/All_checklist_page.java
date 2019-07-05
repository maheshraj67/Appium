package Appium_Test.Appiumtest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class All_checklist_page {
	public void All_checlist_page(AppiumDriver<MobileElement>driver){
		try{
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	@AndroidFindBy(id="tvback")
	private WebElement back;
	public void click_back(){
		back.click();
	}
	
	@AndroidFindBy(id="ivarrowleft")
	private WebElement previous_day;
	public void click_previous_day(){
		previous_day.click();
	}
	
	@AndroidFindBy(id="ivarrowright")
	private WebElement next_day;
	public void click_next_day(){
		next_day.click();
	}
	
	@AndroidFindBy(id="tv_schedulename")
	private List<WebElement> schedule_name;
	public void schedule_name(int a){
		schedule_name.get(a).click();
	}
	
	@AndroidFindBy(id="tv_locations")
	private WebElement no_of_loc;
	public void location_count(){
		no_of_loc.click();
	}
	
	@AndroidFindBy(id="tvValueSubmitted")
	private WebElement submitted_val;
	public void submitted_value(){
		submitted_val.click();
	}
	
	@AndroidFindBy(id="tvValueMissed")
	private WebElement missed_val;
	public void missed_value(){
		missed_val.click();
	}
	
	@AndroidFindBy(id="tvValuePending")
	private WebElement pending_val;
	public void pending_value(){
		pending_val.click();
	}
	
	@AndroidFindBy(id="tvValueFlag")
	private WebElement flag_val;
	public void flag_value(){
		flag_val.click();
	}
	
	/***Nextpage of all schedule***/
	
	@AndroidFindBy(id="imscheduleInfo")
	private WebElement schedule_info;
	public void click_schedule_info(){
		schedule_info.click();
	}
	
	@AndroidFindBy(id="tv_submit")
	private WebElement submit;
	public void click_submit(){
		submit.click();
	}
	
	@AndroidFindBy(id="imscheduleInfo")
	private WebElement schedule_info1;
	public void click_schedule_info1(){
		schedule_info.click();
	}
	
	
}
