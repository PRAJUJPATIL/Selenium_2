package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way3Syntax {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String text=driver.findElement(By.xpath("//h4[contains(@class,'h3 mb-3 selenium-wddriver') or contains(@class,'h3 mb-3 selenium-iide') or contains(@class,'h3 mb-3 selenium-grid')]")).getText();
		System.out.println(text);
		
		}

}