package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String mainwindow = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]")).click();
		Thread.sleep(1000);
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();
		System.out.println(allwindows);
		while(itr.hasNext())
		{
			String window = itr.next();
			driver.switchTo().window(window);
			if(driver.getTitle().equals("Selenium143"))
			{
				driver.close();			
			}
		}
			driver.switchTo().window(mainwindow);
			driver.findElement(By.name("q")).sendKeys("Pritam");
	}

}
