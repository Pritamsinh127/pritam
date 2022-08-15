package seleniumEM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //Imp for gettext method
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/h3[1]/a[1]"));
		
		String text = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/h3[1]/a[1]")).getText();
		
		System.out.println(text);
	}

}
