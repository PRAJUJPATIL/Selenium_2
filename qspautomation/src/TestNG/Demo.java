package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo {
  @Test
  public void P() {
	//1 System.out.println("Qspider"); // get console output not a report
	  //2 Reporter.log("qspider");   // get a report not a console output
    Reporter.log("Qspider", true); // get both console output and report
  
  }
}
