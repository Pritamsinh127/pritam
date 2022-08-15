package seleniumEM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(1000);
		
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result =OTPButton.isEnabled();
		System.out.println("OTP button enabled is "+ result);
		
		WebElement MobNoField = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		MobNoField.sendKeys("8888888888");
		
		Thread.sleep(1000);
		
		boolean result1 =OTPButton.isEnabled();
		System.out.println("OTP button enabled is "+ result1);
		
		if(result1)
		{
		OTPButton.click();
		System.out.println("Clicked on OTP button");
		}
		
		else {
		// mobileNumField.sendKeys("888888888");
		System.out.println("failed to click on OTP button");
		}
	}

}
