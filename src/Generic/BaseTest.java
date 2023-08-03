package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	static
	{
		System.setProperty("WebDriver.chrome.driver", ",/Driver/chromedriver.exe");
	}
	@BeforeTest
	public void openapp()
	{
		
		 driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
	}

}
