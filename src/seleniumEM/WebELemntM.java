package seleniumEM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebELemntM {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		Thread.sleep(1000);
        
		driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("abc8542195");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(1000);
		
		
	}


}
