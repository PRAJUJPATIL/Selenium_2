package Mockwork;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	driver.findElement(By.xpath("//div[@class=\"_4rR01T\"]")).click();
	
	String a = driver.getWindowHandle();
	Set<String> b = driver.getWindowHandles();
	for(String c:b)
	driver.switchTo().window(c);
	
	
	driver.findElement(By.xpath("(//div[@class=\"_2C41yO\"])[2]")).click();
	
	driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411004");
	
	driver.findElement(By.xpath("//span[@class=\"_2P_LDn\"]")).click();
	
	driver.findElement(By.xpath("//a[@class=\"_1fGeJ5 PP89tw\"]")).click();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	driver.findElement(By.xpath("(//div[@class='_3dsJAO'])[2]")).click();
	
	driver.findElement(By.xpath("//div[@class=\"_3dsJAO _24d-qY FhkMJZ\"]")).click();
}

}
