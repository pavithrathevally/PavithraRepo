package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class KsrtcLogin 
{
	static WebElement element;

	@FindBy(how=How.XPATH,using= "//*[@id='txtJourneyDate']")
	public WebElement onward_Journey;
	
	@FindBy(how=How.XPATH,using= "//*[@id='ui-datepicker-div']/div/div/span[1]")
	public WebElement month;
	

	@FindBy (how=How.XPATH,using= "//*[@id='ui-datepicker-div']/div/a[2]/span")
	public WebElement next;
	
	
	@FindBy (how=How.XPATH,using= "//div[@id='ui-datepicker-div']//table//tbody//tr//td//a[contains(text(),'4')]")
	public WebElement date;
		
	public WebElement selectDate(WebDriver driver,int dd)
			
	{//	System.out.println("//div[@id='ui-datepicker-div']//table//tbody//tr//td//a[contains(text(),'"+dd+"')]");
		
element=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr//td//a[contains(text(),'"+dd+"')]"));
	return element;
			
	}

}