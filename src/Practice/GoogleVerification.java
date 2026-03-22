package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleVerification {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("gsr")).sendKeys("selenium tutorial");
		//driver.findElement(By.xpath("//*[@id='gsr']")).sendKeys("selenium tutorial");
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium tutorial");
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
