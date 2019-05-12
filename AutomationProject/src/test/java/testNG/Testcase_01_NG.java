package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(helper.ListenerTest.class)

public class Testcase_01_NG 
{
	private static WebDriver driver = null;
	
	@BeforeTest
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	@Test(dataProvider = "Authentication")
	public void test()
	{
		
		driver.get("http://www.facebook.com");	
	}
	@AfterMethod
	public void Close()
	{
		driver.close();
	}	

}
