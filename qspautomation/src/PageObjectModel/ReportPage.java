package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {
	//declaration
	@FindBy(xpath="//span[contains(text(),'Create Report')]") private WebElement CreateReportbutton;
	@FindBy(xpath="//td[@id='ext-gen21']") private WebElement CreateReportDropdown; 
	@FindBy(xpath ="//a[text()='Logout']") private WebElement logOutLink;
	
	
	
	
	//initialization
	public ReportPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	
	
	//utilization
	public WebElement getCreateReportbutton() {
		return CreateReportbutton;
	}
	public WebElement getCreateReportDropdown() {
		return CreateReportDropdown;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	
	//operational method
	public void logoutActitime()
	{
		logOutLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
