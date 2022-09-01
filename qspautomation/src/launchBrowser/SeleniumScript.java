package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		//took the user input 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the browser name, chrome or firefox");
		String browserValue = sc.nextLine();

		//browser value variable contain the name of the browser which is supposed to be 

		if (browserValue.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			driver = new ChromeDriver(); // to open the browser 
			driver.manage().window().maximize(); // to maximize the browser 
			driver.get("https://www.facebook.com"); // launch the web appication 
			Thread.sleep(5000); // open till 5min 
		    driver.close();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox") )
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

			driver = new FirefoxDriver(); // to open the browser 
			driver.manage().window().maximize(); // to maximize the browser 
			driver.get("https://www.facebook.com"); // launch the web appication 
			Thread.sleep(5000); // open till 5min 	 
			
		}
		
		else
		{
			System.out.println("type valid input");
		}


	}
}
