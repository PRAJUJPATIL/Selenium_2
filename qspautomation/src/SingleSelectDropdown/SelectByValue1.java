package SingleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/basic_html_form.html");
		
		Thread.sleep(3000);
		WebElement ssdrop = driver.findElement(By.xpath("//select[@name=\"dropdown\"]"));
		Select sele = new Select(ssdrop);
		sele.selectByValue("dd2");
}
}