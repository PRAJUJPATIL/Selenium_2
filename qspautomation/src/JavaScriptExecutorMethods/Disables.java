package JavaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/SHREE/Documents/Automation%20class/disabledelement.html");
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('i1').value='prajuj'\r\n");
	
	
	
	
}
}
