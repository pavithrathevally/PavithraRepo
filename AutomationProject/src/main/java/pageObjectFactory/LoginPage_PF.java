package pageObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PF 
{
	@FindBy(how = How.ID , using = "email")
	public WebElement txtBx_UserName;
	
	@FindBy(how = How.ID , using = "pass")
	public WebElement txtBx_Password;
	
	@FindBy(how = How.XPATH , using = "//*[@id = 'u_0_2']")
	public WebElement btn_Login;
}
