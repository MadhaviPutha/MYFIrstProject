package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonsingleselectdropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//we are storing the search drop down info in box variable of data type webelement
		//finding element using xpath with single element  
		//By.xpath("//tagname[@attributename='value']")
		//WebElement box=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		WebElement box=driver.findElement(By.id("searchDropdownBox"));
		
		//all methods are present inside the class where they are defined and are available in 'Select' class
		Select select=new Select(box);  
		
		// select the object in drop down we have 3 methods which is available in 'Select' class
		
		select.selectByIndex(2); // 1st method - select by index
		Thread.sleep(2000); 
		select.selectByValue("search-alias=baby-products-intl-ship"); // 2nd method - select by value
		Thread.sleep(2000);
		select.selectByVisibleText("Computers"); // 3rd method - select by visible text
		Thread.sleep(2000);
		driver.close();
		
	}

}
