package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
		driver.quit();
	}

}





