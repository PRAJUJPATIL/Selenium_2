package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.List;
import java.util.Set;
public class OmayoParentClose 
{
   public static void main(String[] args) 
   {
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://omayo.blogspot.com/");
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
      
      String m = driver.getWindowHandle();
      driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
      
      driver.close();
      
   }
}