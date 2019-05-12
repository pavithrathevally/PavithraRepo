package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Fb 
{
		private static WebElement element = null;
		public static WebElement txbx_Username(WebDriver driver)
		{
		element = driver.findElement(By.id("email"));
		return element;
		}

		public static WebElement txbx_Password(WebDriver driver)
		{
		element = driver.findElement(By.id("pass"));
		return element;
		}

		public static WebElement btn_Login(WebDriver driver)
		{
		element = driver.findElement(By.xpath("//*[@id = 'u_0_2']"));
		return element;
		}

}
