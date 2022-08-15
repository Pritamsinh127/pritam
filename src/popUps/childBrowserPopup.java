package popUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		String idOfMainPage=driver.getWindowHandle();					//to get single id(id changes whenever you refresh the page/window)
		System.out.println(idOfMainPage);
		
		Set<String> idOfAllPages = driver.getWindowHandles();			//to get multiple ids
		System.out.println(idOfAllPages);
		
		ArrayList<String> al=new ArrayList<>(idOfAllPages);				//Convert set into ArrayList
		String newidOfMainPage = al.get(0);
		String idOfChildPage = al.get(1);
		
		driver.switchTo().window(idOfChildPage);						//Switch selenium focus from main page to child page
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Child B-Popup");
	}

}
