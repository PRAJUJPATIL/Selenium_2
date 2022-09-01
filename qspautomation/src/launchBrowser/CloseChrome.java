package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// To avoid The IllegalStException
	ChromeDriver driver = new ChromeDriver();//to Open The Browser
		Thread.sleep(5000);
		driver.close();
	}

}
