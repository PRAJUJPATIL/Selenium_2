package Assignment2;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSet1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SHREE/Documents/Automation%20class/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		List<WebElement> x = sel.getOptions();
		TreeSet<String> n=new TreeSet<String>();
		for (int i = 0; i <  x.size(); i++) 
		{
			String text= x.get(i).getText();
			n.add(text);
		}
		for(String op:n)
		{
			System.out.println(op);
		}

	}
}
