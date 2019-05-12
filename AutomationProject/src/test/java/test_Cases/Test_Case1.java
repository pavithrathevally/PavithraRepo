package test_Cases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage_Fb;
import pageObject.Home_Page;
public class Test_Case1 
{
	public static void main(String[] args) 
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sooraj\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// use page object library now
		LoginPage_Fb.txbx_Username(driver).sendKeys("pavithraparu23@gmail.com");
		LoginPage_Fb.txbx_Password(driver).sendKeys("PAMI@astm123");
		LoginPage_Fb.btn_Login(driver).click();
		System.out.println("Login Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		Home_Page.link_Profile(driver).click();
		System.out.println("Clicked on profile");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Home_Page.link_AccountSetting(driver).click();
		System.out.println("Clicked on Account Settings");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Home_Page.link_LogOut(driver).click();
		System.out.println("Successfully Logged out");
		driver.close();   
		}
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}
}
}
