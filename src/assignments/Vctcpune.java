package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctcpune {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main window handle - "+mainWindowHandle + driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String windowHandle : windowHandles) 
		{
			if(!windowHandle.equals(mainWindowHandle)) 
			{
				driver.switchTo().window(windowHandle);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(1000);
				driver.close();
			}
		}

		driver.switchTo().window(mainWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Pritam's Assignment");

		Thread.sleep(1000);
		driver.quit();
		
	}

}
