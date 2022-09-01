package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

	//declaration
	@FindBy(xpath="//input[@value='Create New Tasks']") private WebElement createnewtaskbutton;
	@FindBy(xpath="//td[@id='cpSelector.cpButton.contentsContainer']") private WebElement CustomersAndProjectsDropdown;
	@FindBy(xpath="//input[@class='controlBorder']") private WebElement FilterTaskByNameTextField;
	@FindBy(xpath="//input[@id='tasksFilterSubmitButton']") private WebElement ApplyFilterButton;
	@FindBy(xpath ="//a[text()='Logout']") private WebElement logOutLink;
	
	
	//initialization
	public TasksPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getCreatenewtaskbutton() {
		return createnewtaskbutton;
	}
	
	public WebElement getCustomersAndProjectsDropdown() {
		return CustomersAndProjectsDropdown;
	}
	public WebElement getFilterTaskByNameTextField() {
		return FilterTaskByNameTextField;
	}
	public WebElement getApplyFilterButton() {
		return ApplyFilterButton;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	//Operational
	
	
	
	
	
	
	
	
	
}
