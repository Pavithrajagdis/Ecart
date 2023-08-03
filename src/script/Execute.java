package script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import pom.Loginpage;
import pom.landingpage;

public class Execute extends BaseTest {
	
	@Test
	public void testexecute() throws InterruptedException
	{
	
		//landingpage lp = new landingpage(driver);
		Loginpage lp=new Loginpage(driver);
	lp.setuser("pavi.eshwar05@gmail.com");
	Thread.sleep(2000);
	lp.setpass("Anvith");
	Thread.sleep(2000);
		//lp.Loginpage("Pavi.eshwar05@gmail.com","Anvith");
	lp.clicklogin();
		//lp.loginApplication("Pavi.eshwar05@gmail.com","Jagdis@12");
		
	
	}
}
