package Mockwork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://selenium-by-arun.blogspot.com/");
		driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();
		
	}
}
