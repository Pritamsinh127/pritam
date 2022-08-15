package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDL_M {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s1=new Select(year);
		s1.selectByValue("2000");
		System.out.println(s1.isMultiple());
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByIndex(5);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s3=new Select(day);
		s3.selectByIndex(10);
		
		for(int i=0;i<=9;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(200);
		}
		
		
	}

}
