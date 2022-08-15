package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nationalgeographic.com/");
		Thread.sleep(2000);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random =RandomString.make(3);
		
		File desti = new File("//C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\Screenshots\\Snapshot"+random+".png");
		FileHandler.copy(src, desti);
		
	}

}
