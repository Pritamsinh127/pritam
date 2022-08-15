package testNG_P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestCase {
  
	WebDriver driver;
	
	@BeforeMethod
  public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
  }
	
	@Test
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void googlelogoTest() {
		boolean value = driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();
	}
	
	@AfterMethod
	public void down() {
		driver.quit();
	}
	
}
