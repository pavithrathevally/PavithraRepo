package data_driven_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	private static WebDriver driver;
	@DataProvider(name = "Authentication")
	public static Object[][] credentials()
	{
		return new Object[][]
				{
			
			{
				"testuser1" , "test@123"
			} , 
			{
				"testuser2" , "test@456"
			}
				};
	}
	// here we are calling the Data Provider object with its Name
	@Test(dataProvider = "Authentication")
	public void test(String sUserName , String sPassword) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(sUserName);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.close();		
	}
	

}
