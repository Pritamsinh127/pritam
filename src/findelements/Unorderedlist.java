package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderedlist {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("marvelm");
		Thread.sleep(1000);
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement r:result)
		{
			System.out.println(r.getText());
		}
		for(WebElement r:result)
		{
			String expectedResult="marvelmemes";
			String actualText=r.getText();
			if(actualText.equals(expectedResult))
			{
				r.click();
				break;
			}			
		}
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("(//img[@class='rg_i Q4LuWd'])[1]")).click();
	}

}
