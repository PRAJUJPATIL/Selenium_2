package Mockwork;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childmaximize {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	driver.findElement(By.xpath("//button[@id=\"login-google-button\"]")).click();
	String a = driver.getWindowHandle();
	System.out.println(a);
	Set<String> b = driver.getWindowHandles();
	System.out.println(b);
	for(String c:b)
	 {
		if(!a.equals(c))
		{
			driver.switchTo().window(c);
			driver.manage().window().maximize();
		}
	 }
	}

}
