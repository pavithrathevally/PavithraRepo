package data_driven_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingParameters
{
	private static WebDriver driver;
	@Test
	@Parameters({"sUsername","sPassword"})
	public void test(String sUsername , String sPassword) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(sUsername);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		WebElement ele=driver.findElement(By.xpath("//span[@class='_2md']"));//xpath of f image
		System.out.println(ele.getText());
		Assert.assertEquals(ele.getText(), "Facebook");
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.close();		
	}
		
	}

