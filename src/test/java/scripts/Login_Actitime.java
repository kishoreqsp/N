package scripts;

import org.testng.annotations.Test;
import generic.Base_Test;
import pom.LoginPage;

public class Login_Actitime extends Base_Test{

	@Test
	public  void login() throws InterruptedException {
		
		LoginPage lp = new  LoginPage(driver);
		
		lp.setUsername("admin");
		
		lp.setPassword("manager");
		
		lp.clickLogin();
		
	}
  
}











