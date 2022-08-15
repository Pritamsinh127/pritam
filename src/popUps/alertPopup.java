package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(1000);
		
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		
		//alt.accept();  //timeoutexception with this method
		//Thread.sleep(1000);
		
		

	}

}
