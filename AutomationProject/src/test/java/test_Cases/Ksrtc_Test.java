package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObject.KsrtcLogin;

public class Ksrtc_Test
{
	public static void main(String[] args) 
	{
		
		String mon="April";
		int dd=4;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sooraj\\\\eclipse-workspace\\\\SeleniumAutomation\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");	
		driver.manage().window().maximize();
		
		KsrtcLogin search= PageFactory.initElements(driver, KsrtcLogin.class);
		search.onward_Journey.click();
		
		System.out.println("First"+search.month.getText());

		while(true)
		    {	
			
				if(search.month.getText().equals(mon))
		    {
			break;
		    }
		else
		    {
			search.next.click();
			System.out.println("Clicked");
							
		    }
			    }
		System.out.println("Second"+search.month.getText());
		
		search.selectDate(driver, dd).click();
		

		}

}
