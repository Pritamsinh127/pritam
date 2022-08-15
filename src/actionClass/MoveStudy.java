package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement mobiles = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		
		act.moveToElement(mobiles).perform();
		//mobiles.click(); //webelement click();, we don't use this (); for action class
		act.click().perform();
		//To click on radio button
		WebElement oneplus = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]"));
		act.moveToElement(oneplus).click().build().perform();
		
	}

}
