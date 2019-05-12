package test_Cases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObjectFactory.HomePage_PF;
import pageObjectFactory.LoginPage_PF;

public class Test_Case_PF1 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		HomePage_PF homepage = PageFactory.initElements(driver, HomePage_PF.class);
		LoginPage_PF loginpage = PageFactory.initElements(driver, LoginPage_PF.class);
		loginpage.txtBx_UserName.sendKeys("pavithraparu23@gmail.com");
		loginpage.txtBx_Password.sendKeys("PAMI@astm123");
		loginpage.btn_Login.click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//rb.keyPress(KeyEvent.VK_ESCAPE);
		homepage.profileName.click();
		System.out.println("Logged in successfully");
		String title = driver.findElement(By.xpath("//input[@data-testid = 'search_input']")).toString();
		System.out.println("Profile name : " + title);
		System.out.println("Profile name : " + driver.getTitle());
		homepage.link_AccountSetting.click();
		homepage.btn_LogOut.click();
		driver.quit();
		}
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}
		
	}

}
