package Mockwork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class robotexample {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	String n = driver.getCurrentUrl();
	System.out.println(n);
	String m = driver.getTitle();
	System.out.println(m);
	driver.findElement(By.xpath("(//img[@class=\"_396cs4  _3exPp9\"])[3]"));
	
	Actions a = new Actions(driver);
	a.contextClick().perform();
	Robot ro = new Robot();
	for(int i=1;i<=10;i++)
	{
		ro.keyPress(KeyEvent.VK_DOWN);
	  
		 for(int b=1;b<=10;b++)
		   {
			   ro.keyPress(KeyEvent.VK_DOWN); 
		   }
	}
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);

	}
}
