
package iFrame;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class IFrame2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Date and Time.')]")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random =RandomString.make(3);
		
		File desti = new File("//C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\Screenshots\\Snapshot"+random+".png");
		FileHandler.copy(src, desti);
		
		driver.close();

	}

}
