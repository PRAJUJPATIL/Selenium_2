package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEx {
          public static void main(String[] args) throws InterruptedException {
        		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        		WebDriver driver= new ChromeDriver();
        		driver.manage().window().maximize();
        		driver.get("https://www.amazon.in/");
        		Thread.sleep(2000);
        		
        		driver.findElement(By.xpath("(//img[@class=\"landscape-image\" ])[12]")).click();
        		driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\" and .=\"OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)\"]")).click();
}
}
