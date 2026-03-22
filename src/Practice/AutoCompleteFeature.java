package Practice;
// script to select the third item from the search text box
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFeature {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marriott.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("DOSGXUMF_search-location")).sendKeys("Hyd");
		
		driver.findElement(By.xpath("//input[contains(@id,'search-location')]")).sendKeys("Hyd");
		
		for(int i=0;i<=3;i++)
		{
			driver.findElement(By.xpath("//input[contains(@id,'search-location')]")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'search-location')]")).sendKeys(Keys.ENTER);
		
		// xpath with text method
		//htmltagname[text()=’value’]
		// driver.findElement((By.xpath("//button[text()=' Find Hotels ']"))).click();
		
		driver.findElement(By.xpath("//*[@id='find-a-hotel-homePage-form']/div[2]/div[6]/button")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
