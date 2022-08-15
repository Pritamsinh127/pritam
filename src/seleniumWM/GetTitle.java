package seleniumWM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(5000);  //throws InterruptedException - is for Thread.sleep()
		
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(title);
		//getTitle: this method is use to get title of a webpage. 
		
		//getCurrentURL: this method is use to get URL of a webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

	}

}
