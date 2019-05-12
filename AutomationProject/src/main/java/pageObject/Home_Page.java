package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page 
{
private static WebElement element = null;
	
	public static WebElement link_Profile(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//span[@class='_1vp5']"));
		return element;
	}
	
	public static WebElement link_AccountSetting(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		return element;
	}
	
	public static WebElement link_LogOut(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
		return element;
	}
}
