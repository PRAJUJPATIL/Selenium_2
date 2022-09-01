package ActionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {
          public static void main(String[] args) throws InterruptedException {
        		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        		WebDriver driver= new ChromeDriver();
        		driver.manage().window().maximize();
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        		driver.findElement(By.id("btnLogin")).click();
        		WebElement n = driver.findElement(By.xpath("//b[.=\"PIM\"]"));
        		Actions act = new Actions(driver);
        		act.moveToElement(n).perform();
          }
          }