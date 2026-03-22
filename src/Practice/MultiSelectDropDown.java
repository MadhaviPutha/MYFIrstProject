package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Documents/Samreen/multiplebox1.html");
		driver.manage().window().maximize();

		WebElement box = driver.findElement(By.id("tools"));
		Select select = new Select(box);
		
		// list is data type and webelement is of which type, here it is webelement else if it is string we have to write string type
		//getOptions will get the tags but not the text hence we write of type webelement
		List<WebElement> alloptions = select.getOptions();

		System.out.println("All options in drop down");

		for (WebElement opt : alloptions) {
			String data = opt.getText();
			System.out.println(data);
			//if data contains value Selenium IDE or Selenium WebDriver then it selects those values using visibletext method
			if (data.equals("Selenium IDE") || data.equals("Selenium WebDriver")) {
				select.selectByVisibleText(data);
			}
		}
		
		List<WebElement> allselectedoptions = select.getAllSelectedOptions();
		System.out.println("All selected options");
		for (WebElement opt : allselectedoptions) {
			String data = opt.getText();
			System.out.println(data);
		}
		
		System.out.println("All non selected options");
		for (WebElement opt : alloptions) {
			if (!opt.isSelected()) {
				String data = opt.getText();
				System.out.println(data);
			}

		}

	}

}
