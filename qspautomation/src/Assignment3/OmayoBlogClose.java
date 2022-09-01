package Assignment3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogClose
{
          public static void main(String[] args) throws InterruptedException {
        		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        		WebDriver driver= new ChromeDriver();
        		driver.manage().window().maximize();
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        		driver.get("https://omayo.blogspot.com/");
        		driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
        		String A = driver.getWindowHandle();
        		System.out.println(A);
        		
        		Set<String> B= driver.getWindowHandles();
        		System.out.println(B);
        		
        		
        		for (String C : B) 
        		{
        		       driver.switchTo().window(C);
        		       driver.close();
                }
        		
}
}



