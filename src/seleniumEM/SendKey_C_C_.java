package seleniumEM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey_C_C_ {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar");
		
		WebElement searchIcon = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		searchIcon.click();
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		
		
	}
		
}
