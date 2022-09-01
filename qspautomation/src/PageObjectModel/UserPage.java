package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	//declaration
	@FindBy(xpath="(//input[@value='Create New User']") private WebElement CreateNewUserButton;
	@FindBy(xpath ="//a[text()='Logout']") private WebElement logOutLink;
	
	
	//initialization
	public UserPage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	
	public WebElement getCreateNewUserButton() {
		return CreateNewUserButton;
	}
	
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	
	
	
	
	
	
	
	
}
