package linkCounts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksNo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marvel.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a")); //for link
		System.out.println(links.size()); //for link count
		for(WebElement l:links) //to print names of all the links
		{
			System.out.println(l.getText());
		}
		
		//List<WebElement> images = driver.findElements(By.tagName("img")); 
		//System.out.println(images.size()); 
		
	}
}
