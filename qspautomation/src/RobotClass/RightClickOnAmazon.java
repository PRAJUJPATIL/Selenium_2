package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnAmazon {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		Actions n = new Actions(driver); 
		n.contextClick().perform();
	    Robot ro = new Robot(); 
	    
        for (int i = 1; i <=10; i++) 
		{
			ro.keyPress(KeyEvent.VK_DOWN);
			for (int a = 1; a <=10; a++)
			{
				ro.keyRelease(KeyEvent.VK_DOWN);	
			}
			
		}
	    
	    ro.keyPress(KeyEvent.VK_ENTER);
	    ro.keyRelease(KeyEvent.VK_ENTER);
	    	
	}
	
}
