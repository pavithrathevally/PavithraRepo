package data_driven_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtils;

public class DataProviderWithExcel2
{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");		
	}
	@DataProvider(name = "Authentication")
	public Object[][] Authentication() throws Exception
	{
		Object[][] testObjData = ExcelUtils.getExcelData("D:\\Selenium\\Data-Driven-Test.xlsx" , "Sheet1");
		return (testObjData);
	}
	@Test(dataProvider = "Authentication")
	public void Login(String sUserName , String sPassword)throws Exception
	{
		driver.findElement(By.id("email")).sendKeys(sUserName);
		System.out.println(sUserName);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		System.out.println(sPassword);
		driver.findElement(By.id("u_0_2")).click();
		System.out.println("Login Successfully");
		
	}
	@AfterMethod
	public void Close()
	{
		driver.close();
	}

}
