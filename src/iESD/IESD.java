package iESD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IESD {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement username=driver.findElement(By.id("email"));
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(1000);
		
		WebElement radioFemale = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		System.out.println("Female radio button selection status is "+radioFemale.isSelected());
		radioFemale.click();
		Thread.sleep(1000);
		
		System.out.println("Female radio button selection status is "+radioFemale.isSelected());
	}

}
