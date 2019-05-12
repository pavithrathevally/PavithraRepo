package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class UIActionKeywords2 
{
	public static WebDriver driver;
	@BeforeTest
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public static void navigate()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	@Test
	public static void search()
	{
		driver.findElement(By.xpath("//*[Contains(@title,'Search')]")).sendKeys("pink");
	}
	@Test
	public static void ClickSearch()
	{
		driver.findElement(By.xpath("//*[Contains(@name,'btnK')]")).click();
	}
	@Test
	public static void applyWait() throws Exception
	{
		Thread.sleep(2000);
	}
	@AfterTest
	public static void closeBrowser()
	{
		driver.quit();
	}
}
