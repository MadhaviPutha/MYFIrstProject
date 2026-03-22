package TestNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class smallTest {

@BeforeMethod(groups="Title")
public void setUp()
{
	System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	String Title=driver.getTitle();
	System.out.println("Title of the browser is :" + Title);
}

@Test(groups="Title2")
public void googleTitleTest()
{
	String Title=driver.getTitle();
	System.out.println(Title);
}

@Test(groups="Title2",dependsOnMethods="googleTitleTest")
public void test1()
{
	System.out.println("My head");
}

@AfterMethod(groups="Title")
public void googleClose()
{
driver.close();
}
}
