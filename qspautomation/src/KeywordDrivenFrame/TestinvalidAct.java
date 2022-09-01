package KeywordDrivenFrame;

import java.io.IOException;

import org.openqa.selenium.By;



public class TestinvalidAct  extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataAct.xlsx","invalid");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/TestDataAct.xlsx","invalid",i,0);

			String password = flib.readExcelData("./data/TestDataAct.xlsx","invalid",i,1);

			System.out.println(i);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();


	}

}