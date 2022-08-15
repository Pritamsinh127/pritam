package popUps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class hiddendivPopup {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
				driver.findElement(By.name("q")).sendKeys("oneplus9");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String random=RandomString.make(3);
				File dest = new File("//C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\Screenshots\\Snapshot"+random+".png");
				FileHandler.copy(src, dest);
				
				driver.close();
	}

}
