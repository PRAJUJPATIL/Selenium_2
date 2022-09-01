package JavaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		//Scroll Down
		jse.executeScript("window.scrollBy(0,3000)\r\n");
		Thread.sleep(4000);
		
		//Scroll Up
		jse.executeScript("window.scrollBy(0,-3000)\r\n");
	
		
		
	
	
	
	}
}