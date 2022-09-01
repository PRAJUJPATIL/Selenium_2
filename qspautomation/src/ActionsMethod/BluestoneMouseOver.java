package ActionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneMouseOver {
          public static void main(String[] args) throws InterruptedException {
        		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        		WebDriver driver= new ChromeDriver();
        		driver.manage().window().maximize();
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwio6XBhCMARIsAC0u9aFP4eGhTs6LZqjV_qsfeduDsBrnzV_UqTIgbUcYquPWwTC9L5nZBnMaAuv6EALw_wcB");
        		driver.findElement(By.id("denyBtn")).click();
        		WebElement abc = driver.findElement(By.xpath("//a[@title='Jewellery']"));
        		
        		
        		Actions act = new Actions(driver);
        		act.moveToElement(abc).perform();
        		driver.findElement(By.xpath("//span[.=\"Kadas\"]")).click();
        		WebElement abc1 = driver.findElement(By.xpath("(//a[@class='link-overlay']/ancestor::div[@class=\"grid-view browse-page-var2 g34 row grid-view-result-active\"]/descendant::a[@class=\"link-overlay\"])[5]"));
        		System.out.println("Kadas Price :" + abc1);
          }
          }