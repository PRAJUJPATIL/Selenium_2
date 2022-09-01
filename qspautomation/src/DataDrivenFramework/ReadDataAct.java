package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataAct {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-asciffb/login.do");
		
		Flib flib = new Flib();
		String user = flib.readExcelData("./data/TestdataAct.xlsx", "valid", 1,0);
		String pass = flib.readExcelData("./data/TestdataAct.xlsx", "valid", 1,1);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
		
	
	}
}
		