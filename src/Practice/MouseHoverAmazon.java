package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverAmazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		// as we are hovering the text and we dont want to click then we have to
		// store it in a variable viz., hellosignin
		WebElement hellosignin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		// to do mousehover we have predefined class 'Actions' and we have to create an object
		// it is an constructor type of class Actions, whenever we are creating an object we have to pass an argument
		Actions action = new Actions(driver);
		// inside that Actions class we have a predefined method moveToElement, where cursor will move to that element and
		// perform() method will perform the action
		action.moveToElement(hellosignin).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Find a Gift']")).click();
		driver.close();*/
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.ebay.com");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		//WebDriverWait wait=new WebDriverWait(driver1,10);
		//WebElement el = wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//a[text()='Fashion']")));
		WebElement myebay = driver1.findElement(By.xpath("//*[@title='My eBay']"));
		Actions action1=new Actions(driver1);
		action1.moveToElement(myebay).perform();
		//WebElement myebay = driver1.findElement(By.xpath("//a[@href='Fashion']"));
		//WebElement myebay = driver1.findElement(By.xpath("//a[text()='Fashion']"));
		//driver1.findElement(By.xpath("//*[@class='gh-eb-oa thrd']")).click();
		//href="https://www.ebay.com/myb/container?key=recentlyviewed"
		//Xpath=//a[@href='http://demo.guru99.com/']		
		//driver1.findElement(By.xpath("//a[@href='https://www.ebay.com//myb//container?key=recentlyviewed']")).click();
		//driver1.findElement(By.xpath("//a[@href=' Recently Viewed']")).click();
		//driver1.findElement(By.xpath("//a[@href=' Purchase History']")).click();
		//*[@id="gh-eb-My-o"]/ul/li[5]/a
		//driver1.findElement(By.xpath("//*[@id='gh-eb-My-o']/ul/li[5]/a")).click();
		//driver1.findElement(By.xpath("//*[@id='gh-eb-My-o']/ul/li[2]/a")).click();
		//driver1.findElement(By.xpath("//a[@href=' Purchase History']")).click();
		driver1.findElement(By.xpath("//input[contains(@href,' Purchase History')]")).click();
	}
}
