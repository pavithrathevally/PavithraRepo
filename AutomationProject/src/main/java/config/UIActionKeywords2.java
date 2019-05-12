package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIActionKeywords2 
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
		driver.get("https://www.google.com");
	}
	public static void search()
	{
		driver.findElement(By.xpath("//*[Contains(@title,'Search')]")).sendKeys("pink");
	}
	public static void ClickSearch()
	{
		driver.findElement(By.xpath("//*[Contains(@name,'btnK')]")).click();
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
