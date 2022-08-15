package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='product']//tbody/tr"));           //No. of rows
		System.out.println("No. of rows in a given table are = "+totalrows.size());
		
		List<WebElement> totalcells = driver.findElements(By.xpath("//table[@id='product']//tbody/tr[1]/th"));   //No. of cells
		System.out.println("No. of cells in a given table are = "+totalcells.size());
		
		
	}

}
