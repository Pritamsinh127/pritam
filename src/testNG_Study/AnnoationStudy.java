package testNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AnnoationStudy {
  @Test
  public void ValidUserID() 
  {
	  Reporter.log("User ID is validated",true);
  }
  
  @BeforeMethod
  public void login() 
  {
	  Reporter.log("Login done",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("Log out done",true);
  }
  
  @Test
  public void testme() 
  {
	  Reporter.log("HI",true);
  }

}
