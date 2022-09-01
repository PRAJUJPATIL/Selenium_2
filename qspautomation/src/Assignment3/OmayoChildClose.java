package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;
public class OmayoChildClose 
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
      Set<String> n = driver.getWindowHandles();
      for(String c:n)
      {
    	  if(!n.equals(m))
    	  {
    		  driver.switchTo().window(m);
    		  driver.close();
    	  }
      }
//      driver.switchTo().window(n);
//      driver.close();
      
   }
}