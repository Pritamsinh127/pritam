package kiteLoginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteEnd2EndTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("ELR321");
		Thread.sleep(5000);
		password.sendKeys("Dhana1111");
	    loginbutton.click();
	    System.out.println("Accepted uID");
		Thread.sleep(5000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		pin.sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Submitted");
		Thread.sleep(5000);
		WebElement userprofile = driver.findElement(By.xpath("//span[contains(text(),'ELR321')]"));
		userprofile.click();
		System.out.println("userprofile");
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[9]/a[1]"));
		logout.click();
		System.out.println("Logout successfull");
		
	}

}
