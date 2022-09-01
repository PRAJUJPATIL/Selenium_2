package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupsflags {
  @Test(groups = "Functional")
  public void ft1() 
  {
	  Reporter.log("Function TestCase1", true);
  }
  
  @Test(groups = "Integration")
  public void it1() 
  {
	  Reporter.log("Integratio TestCase1", true);
  }
  
  @Test(groups = "Smoke")
  public void sm1() 
  {
	  Reporter.log("Smoke TestCase1", true);
  }
  //----------------------------------------------------
  @Test(groups = "Functional")
  public void ft2() 
  {
	  Reporter.log("Function TestCase2", true);
  }
  
  @Test(groups = "Integration")
  public void it2() 
  {
	  Reporter.log("Integratio TestCase2", true);
  }
  
  @Test(groups = "Smoke")
  public void sm2() 
  {
	  Reporter.log("Smoke TestCase2", true);
  }
  //------------------------------------------------------
  @Test(groups = "Functional")
  public void f31() 
  {
	  Reporter.log("Function TestCase3", true);
  }
  
  @Test(groups = "Integration")
  public void it3() 
  {
	  Reporter.log("Integratio TestCase3", true);
  }
  
  @Test(groups = "Smoke")
  public void sm3() 
  {
	  Reporter.log("Smoke TestCase3", true);
  }
//----------------------------------------------------------
  @Test(groups = "Functional")
  public void ft4() 
  {
	  Reporter.log("Function Test Case4", true);
  }
  
  @Test(groups = "Integration")
  public void it4() 
  {
	  Reporter.log("Integratio Test Case4", true);
  }
  
  @Test(groups = "Smoke")
  public void sm4() 
  {
	  Reporter.log("Smoke Test Case4", true);
  }
//--------------------------------------------------------------------
  @Test(groups = "Functional")
  public void ft5() 
  {
	  Reporter.log("Function Test Case5", true);
  }
  
  @Test(groups = "Integration")
  public void it5() 
  {
	  Reporter.log("Integratio Test Case5", true);
  }
  
  @Test(groups = "Smoke")
  public void sm5() 
  {
	  Reporter.log("Smoke Test Case5", true);
  }
//----------------------------------------------------------------------
  @Test(groups = "Functional")
  public void ft6() 
  {
	  Reporter.log("Function Test Case6", true);
  }
  
  @Test(groups = "Integration")
  public void it6() 
  {
	  Reporter.log("Integratio Test Case6", true);
  }
  
  @Test(groups = "Smoke")
  public void sm6() 
  {
	  Reporter.log("Smoke Test Case6", true);
  }
}

