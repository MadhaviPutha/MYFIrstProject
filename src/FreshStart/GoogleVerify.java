package FreshStart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class GoogleVerify {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); 
	 
		//driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Guitar");
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("violin");
//		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys(Keys.ENTER);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,800)");
//		Thread.sleep(2000);
//		driver.navigate().back();
	//	driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")).click();
		// driver.findElement(By.xpath("//a[starts-with(@aria-label,'Gmail (opens a new tab)')]")).click();
		
		//   driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		//   driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)'] and a[@class='gb_E']")).click();
//driver.findElement(By.className("gb_d gb_Da gb_H")).click();
		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
Alert alert = driver.switchTo().alert();
String alertMssg = driver.switchTo().alert().getText();
System.out.println(alertMssg);




	}

}

