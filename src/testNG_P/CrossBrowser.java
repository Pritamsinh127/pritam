package testNG_P;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
  
	 @Parameters("browserName")
	 
	 @Test
	  public void myMethod(String Bname) {
	  WebDriver driver= null;// declared driver here
	  
	  if(Bname.equals("chrome")){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver= new ChromeDriver();
	  }
	  
	  else if (Bname.equals("firefox")){
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  }
	 
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  
	  }
	 
}
