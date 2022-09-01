package WebPagePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandles {
	  public static void main(String[] args) throws InterruptedException {
	  		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  		WebDriver driver= new ChromeDriver();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  		driver.get("file:///C:/Users/SHREE/Documents/Automation%20class/aleartpopup.html");
	  		driver.findElement(By.xpath("//button[.=\"Try it\"]")).click();
	  		Alert al = driver.switchTo().alert();
	  		al.accept();
	  		
	  		Thread.sleep(3000);
	  		driver.close();
	  }

}
