package Mockwork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentclose {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	driver.findElement(By.xpath("//button[@id=\"login-google-button\"]")).click();
	String A = driver.getWindowHandle();
	System.out.println(A);
	driver.close();

	
	
}
}
