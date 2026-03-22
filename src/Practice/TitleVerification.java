package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TitleVerification {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.marriott.com");
		driver.manage().window().maximize();
		String expectedTitle = "Hotels & Resorts | Book your Hotel directly with Marriott";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle))
			System.out.println("Title is as expected");
		else
			System.out.println("Title is not as expected");

		String expectedUrl = "https://www.marriott.com/default.mi";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		if (expectedUrl.equals(actualUrl))
			System.out.println("URL is as expected");
		else
			System.out.println("URL is not as expected");

		driver.close();
	}

}
