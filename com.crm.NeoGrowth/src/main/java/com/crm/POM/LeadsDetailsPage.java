package com.crm.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class LeadsDetailsPage extends Driver{
	SeleniumUtility sel=new SeleniumUtility();
	
	@FindBy(xpath="//span[contains(@class,\"suitepicon suitepicon-module-activities\")]")
	private WebElement ActivitiesLink;
	
	@FindBy(xpath="//a[text()='Create Task']")
	private WebElement CreatTaskActivitesBtn;
	
	@FindBy(xpath="(//span[@class='suitepicon suitepicon-action-caret'])[4]")
	private WebElement CreateTaskDropDownFromActivites;
	
	@FindBy(xpath="//a[@id='Activities_schedulemeeting_button']")
	private WebElement SchedulemeetingBtn;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement SubjectTF;
	
	@FindBy(xpath="//input[@id='date_start_date']")
	private WebElement SelectFromDateTF;
	
	@FindBy(xpath="//input[@id='date_end_date']")
	private WebElement SelectEndDateTF;
	
	@FindBy(xpath="//select[@id='date_start_hours']")
	private WebElement selectstarthours;
	
	@FindBy(xpath="//select[@id='date_end_hours']")
	private WebElement SelectEndhours;
	
	@FindBy(xpath="//select[@id='date_start_minutes']")
	private WebElement Selectstartminutes;
	
	@FindBy(xpath="//select[@id='date_end_minutes']")
	private WebElement selectendminutes;
	
	@FindBy(xpath="(//input[@type='submit'])[4]")
	private WebElement SaveButtomMeetingspage;
	
	@FindBy(xpath="//tr[@class='oddListRowS1']//span[@class='suitepicon suitepicon-module-meetings']")
	private WebElement CreatetaskBtn;
	
	@FindBy(xpath="//div[@class='moduleTitle']")
	private WebElement meetingpagetitle;
	
	@FindBy(xpath="//div[@type='name']")
	private WebElement meetingpageTF;
	
	@FindBy(xpath="(//table/tbody/tr[1]/td[3])[2]")
	private WebElement createtasklink;
	
	@FindBy(xpath="//button[@id='date_start_trigger']//span[@alt='Enter Date']")
	private WebElement Calnderstartbutton;
	
	@FindBy(xpath="//button[@id='date_end_trigger']//span[@alt='Enter Date']")        
	private WebElement Calenderendbutton;
	
	@FindBy(xpath="//a[@class='calnav']")
	private WebElement monthyear;
	
	@FindBy(xpath="//a[@class='calnavright']")
	private WebElement forwrdbtn;
	
	@FindBy(xpath="//a[@id='Activities_logcall_button']")
	private WebElement LogcallBtn;
	
	
	
	
	
	
	
	public LeadsDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public  void clickdate(String h) {
		WebElement dy = driver.findElement(By.xpath("//a[normalize-space()="+h+"]"));
		dy.click();
	}
	
	public void ClickActivitiesLink()
	{
		sel.scrollToElement(ActivitiesLink,"ActivitiesLink");
		ActivitiesLink.click();
	}
	public void clickcreatetaskdropdown() {
		CreateTaskDropDownFromActivites.click();
	}
	public void clickSchedulemeetingButton() {
		SchedulemeetingBtn.click();
	}
    public void EnterValueinSubjectTF(String Sub) {
    	SubjectTF.sendKeys(Sub);
    }
    public void EnterSelectFromDate(String fromdate) {
    	SelectFromDateTF.clear();
    	SelectFromDateTF.sendKeys(fromdate);
    }
    public void EnterSelectEndDate(String Enddate) {
    	SelectEndDateTF.clear();
    	SelectEndDateTF.sendKeys(Enddate);
    }
    
    public void selectstarthourstime(String hours) {
    	sel.selectByvalue(selectstarthours,hours);
    	
    }
    
    public void selectminutestime(String minute) {
    	sel.selectByvalue(Selectstartminutes, minute);
    }
	
    public void selectendhourstime(String endhours) {
    	sel.selectByvalue(SelectEndhours, endhours);
    }
    
    public void selectendminutestime(String endminute) {
    	sel.selectByvalue(selectendminutes, endminute);
    }
    
    public void clicksavebuttonmeeting() {
    	SaveButtomMeetingspage.click();
    }
    
    public void clicktaskbutton() {
    	CreatetaskBtn.click();
    }
    
    public String getmeetingpagetitle() {
    	return meetingpagetitle.getText();
    }
    public String getmeetingpageTF() {
    	return meetingpageTF.getText();
    }
    
    public String gettasktext() {
    	return createtasklink.getText();
    }
    
    public void CalendeStartrButton(String monthyr) {
    	//sel.clickdatefromcalenderpopup(Calnderstartbutton,monthyear ,monthyr, forwrdbtn);
    	
    }
     public void CalenderEndButtton(String monthyr) {
    	// sel.clickdatefromcalenderpopup(Calenderendbutton,monthyear ,monthyr, forwrdbtn); 
    	
     }
     
    
}
