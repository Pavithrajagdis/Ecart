package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class Loginpage extends Basepage {

	@FindBy (xpath="//input[@id='userEmail']")
	  WebElement user;
	
	@FindBy (xpath="//input[@id='userPassword']")
	 private WebElement passworddd;
	
	@FindBy (xpath="//input[@id='login']")
	 WebElement login;
	
	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//	public void Loginpage(String email,String password)
//	{
//		user.sendKeys(email);
//		passworddd.sendKeys(password);
//		login.click();
//	}

//		ProductCatalogue productCatalogue = new ProductCatalogue(driver);
//		return productCatalogue;
	public void setuser(String username)
	{
		user.sendKeys(username);
	}
	public void setpass(String pass)
	{
		passworddd.sendKeys(pass);
		
	}
	public void clicklogin()
	{
		login.click();
	}
}

