package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIActionKeywords 
{
	public static WebDriver driver;
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void navigate()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	public static void enterEmail()
	{
		driver.findElement(By.id("email")).sendKeys("pavithraparu23@gmail.com");
	}
	public static void enterPassword()
	{
		driver.findElement(By.id("pass")).sendKeys("abc1234");
	}
	public static void clickLogin()
	{
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
	}
	public static void applyWait() throws Exception
	{
		Thread.sleep(2000);
	}
	public static void closeBrowser()
	{
		driver.quit();
	}
}
	
	
	
	
	
	
	
	
	
	
	
