package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/java-do-while-loop-with-examples/");
		driver.findElement(By.id("luser")).sendKeys("prajuj");
		driver.findElement(By.id("password")).sendKeys("shree123");
		driver.findElement(By.tagName("submit")).click();
	}

}
