package zzzzzzz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysCall {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1.By WebElement()
		WebElement search = driver.findElement(By.xpath("//input[@id='email']"));
		//search.sendKeys("Pritam");
		
		//2. By Action class
		//Actions action=new Actions(driver);
		//action.moveToElement(search).sendKeys("Pritam").perform();
		
		//3. By JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Pritam';", search);
	}

}
