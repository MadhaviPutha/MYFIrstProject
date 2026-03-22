package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[@class,'Electronics')"));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'_2I9KP_') and text()='Electronics']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Apple']")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'_2I9KP_') and text()='Baby & Kids']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Shorts']")).click();
		Thread.sleep(5000);
		driver.close();
		//("//input[contains(@id,'search-location')]"))		
	}

}
