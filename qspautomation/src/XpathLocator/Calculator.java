package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		driver.findElement(By.xpath("//span[@onClick='r(5)' and .='5']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(5)' and .='5']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='×']")).click();
		
		
		driver.findElement(By.xpath("//span[@onClick='r(7)' and .='7']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(5)' and .='5']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(5000);
		
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
		
		driver.navigate().refresh();
	}
	
	
	

}