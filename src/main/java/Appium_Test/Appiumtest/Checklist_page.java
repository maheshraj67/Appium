package Appium_Test.Appiumtest;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Checklist_page {
	public Checklist_page(AppiumDriver<MobileElement>driver){
		try {
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        TouchAction touchAction = new TouchAction(driver);
	    } catch (Exception e) {

	        e.printStackTrace();
	    }
	}
	
	@AndroidFindBy(id="ivback")
	 private WebElement back;
	 public void click_back(){
		 back.click();
	 }
	 
	 @AndroidFindBy(id="lvalldschedules")
	 private List<WebElement> Schecule_list;
	 public void click_schedule(int a){
		 Schecule_list.get(a).click();
	 }
	 
	 @AndroidFindBy(id="tv_timer")
	 private List<WebElement> submit_checklist;
	 public void click_submit_checklist(int a){
		 submit_checklist.get(a).click();
	 }
	 
	 @AndroidFindBy(id="btnsubmit")
	 public List<WebElement> submit;
	 public void click_submit(){
		submit.get(0).click();
	 }
	 
	 @AndroidFindBy(id="tvback")
	 private WebElement loc_back;
	 public void click_locback(){
		 loc_back.click();
	 }
	 
	 @AndroidFindBy(id="btnokay")
	 private WebElement timeleft_ok;
	 public void click_timeleft_ok(){
		 timeleft_ok.click();
	 }
	 
	 @AndroidFindBy(id="timeleft")
	 private WebElement timeleft;
	 public void read_timeleft(){
		 String timelef=timeleft.getText();
		 System.out.println(timelef);
	 }
	 
	 @AndroidFindBy(id="attach")
	 private WebElement attach;
	 public void click_attach(){
		 attach.click();
	 }
	 
	 @AndroidFindBy(id="fieldValue")
	 private List<WebElement> field_value;
	 public void click_field_value(int a){
		 field_value.get(a).click();
	 }
	 
	 @AndroidFindBy(id="button1")
	 private WebElement date_ok;
	 public void click_date_ok(){
		 date_ok.click();
	 }
	 
	 @AndroidFindBy(id="button2")
	 private WebElement date_cancel;
	 public void click_date_cancel(){
		 date_cancel.click();
	 }
	 @AndroidFindBy(id="checkboxgroup")
	 private List<WebElement> checkbox;
	 public void select_checkbox(int a){
		 checkbox.get(a).click();
	 }
	 
	 
	 @AndroidFindBy(id="ratingBar")
	 private WebElement rating_bar;
	 public void click_rating(){
		 rating_bar.click();
	 }
	 

}
