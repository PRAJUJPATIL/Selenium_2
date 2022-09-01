package Mockwork;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childclose {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	
	driver.findElement(By.xpath("//button[@id=\"login-google-button\"]")).click();
	String parentHandle= driver.getWindowHandle();
	Set<String> allHandle= driver.getWindowHandles();
	for(String handle:allHandle)
	{
	if(!parentHandle.equals(handle))
	   {
		driver.switchTo().window(handle);
		Thread.sleep(5000);
		driver.close();
	   }
	}
	
}
}
