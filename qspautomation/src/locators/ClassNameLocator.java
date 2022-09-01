package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=htthttps://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjwlK-WBhDjARIsAO2sErSKcXMu9ql0fH6WIIZR-WtqbM9JMp9n_MI1zGEq_h9Ec3wbyQE4AakaAjrMEALw_wcBps://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjwlK-WBhDjARIsAO2sErS_tVFy_uBm5MP4oxpH3HPchxuc9gFNmitsE_iLTmzbyEbij6tBKMUaAhrCEALw_wcB");
		driver.findElement(By.id("tel")).sendKeys("1234567890");
		
		driver.findElement(By.className("submitBottomOption")).click();
	}

}
