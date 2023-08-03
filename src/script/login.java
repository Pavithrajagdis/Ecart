package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", ",/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pavi.eshwar05@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Anvith");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
	}

}
