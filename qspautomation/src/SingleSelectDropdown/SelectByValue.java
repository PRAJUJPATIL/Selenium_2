package SingleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=1662744481227890203&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9304071&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd7jY6cbHFZJBPBtl0M58l3ArVjxA5fWSqEyiyncd9dKAmcJh7yAOpEaAgnjEALw_wcB");
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(5000);
		WebElement ssd = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		Select sel = new Select(ssd);
		sel.selectByValue("search-alias=computers");
		driver.findElement(By.id("searchDropdownBox")).click();
	}

}
 