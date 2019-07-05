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

public class Multisite_dashboard {
	public Multisite_dashboard(AppiumDriver<MobileElement>driver){
		try {
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        
	    } catch (Exception e) {

	        e.printStackTrace();
	    }
		
	}

	
	@AndroidFindBy(id="layoutallsites")
	private WebElement all_site;
	
	public void click_allsite(){
		all_site.click();
	}
	
	@AndroidFindBy(id="layoutgroups")
	private WebElement site_group;
	
	public void click_sitegroup(){
		site_group.click();
	}
	
	@AndroidFindBy(id="tvgroupname")
	private WebElement group_name;
	
	
	@AndroidFindBy(id="siteslistview")
	private List<WebElement> site_list;
	
	@AndroidFindBy(id="tvsitename")
	private List<WebElement> site_name;
	
	public void select_site(int a){
		site_name.get(a).click();
	}
	
	@AndroidFindBy(id="layoutschedules")
	private WebElement schedules;
	
	@AndroidFindBy(id="layoutrp")
	private WebElement review_pending;
	
	@AndroidFindBy(id="layoutflags")
	private WebElement flags;
	
	@AndroidFindBy(id="layoutoi")
	private WebElement open_tickets;
	
	@AndroidFindBy(id="ivgotosite")
	private WebElement move_site;
	
	@AndroidFindBy(id="searchlayout")
	private WebElement search_icon;
	
	public void click_search(){
		search_icon.click();
	}
	
	@AndroidFindBy(id="etmsgtab")
	private WebElement search_site;
	public void enter_sitename(String name){
		search_site.sendKeys(name);
	}
	
	@AndroidFindBy(id="burgerlayout")
	private WebElement menu_icon;
	
	
	@AndroidFindBy(id="backlayout")
	private WebElement back_icon;
	public void click_back(){
		back_icon.click();
	}
	
	@AndroidFindBy(id="tvtodaystotalpercentage")
	private WebElement total_percentage;
	
	@AndroidFindBy(id="tvrp")
	private WebElement total_review_pending;
	
	@AndroidFindBy(id="tvoi")
	private WebElement total_issue;
	
	@AndroidFindBy(id="tvflags")
	private WebElement total_flags;
		
	
}
