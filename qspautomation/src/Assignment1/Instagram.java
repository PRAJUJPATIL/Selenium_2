package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("SooryaVansham");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("HiraThakur");
		
		driver.findElement(By.xpath("//div[.=\"Log In\"]")).click();
	}
}  