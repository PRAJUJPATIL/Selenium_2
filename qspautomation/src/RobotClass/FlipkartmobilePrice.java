package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartmobilePrice {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		driver.findElement(By.xpath("(//div[@class=\"_2C41yO\"])[3]")).click();
		driver.findElement(By.xpath("(//a[@class=\"_1fGeJ5\"])[2]")).click();
		driver.findElement(By.xpath("//input[@class=\"_36yFo0\"]")).sendKeys("425409");
		driver.findElement(By.xpath("//span[@class=\"_2P_LDn\"]")).click();
	}


}