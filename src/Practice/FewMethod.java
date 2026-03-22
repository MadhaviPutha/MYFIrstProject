package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FewMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		/*driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		//driver.findElement(By.xpath(".//[@id='Email']")).sendKeys("khushi");
		driver.findElement(By.name("identifier")).sendKeys("khushi");
		String str= driver.findElement(By.name("identifier")).getAttribute("value");
		String str1= driver.findElement(By.name("identifier")).getAttribute("type");
		System.out.println(str);
		System.out.println(str1);
		driver.close();
		
		
		
	}

}
