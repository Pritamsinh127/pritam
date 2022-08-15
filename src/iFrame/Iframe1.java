package iFrame;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("input")).sendKeys("Pets");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		 WebElement animals = driver.findElement(By.id("animals"));
		 Select s=new Select(animals);
		 s.selectByVisibleText("Avatar");
		Thread.sleep(1000);
		
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random =RandomString.make(3);
		
		File desti = new File("//C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\Screenshots\\Snapshot"+random+".png");
		FileHandler.copy(src, desti);
		
		driver.close();
	}

}
