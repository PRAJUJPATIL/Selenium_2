package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchtwitter 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// To avoid The IllegalStException
	ChromeDriver driver = new ChromeDriver();//to Open The Browser
	driver.manage().window().maximize();
	driver.get("https://www.twitter.com");// To Open the twitter
		Thread.sleep(5000);//Open Application for 5 minutes 
		driver.close();// to close the browser
	}

}