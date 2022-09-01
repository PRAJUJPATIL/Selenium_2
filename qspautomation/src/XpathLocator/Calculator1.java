package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//span[@onclick=\"r('sin')\" and .='sin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick=\"r('(')\" and .='(']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\" and .='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick=\"r(5)\" and .='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick=\"r(')')\" and .=')']")).click();
		Thread.sleep(5000);
		
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
	}

}
