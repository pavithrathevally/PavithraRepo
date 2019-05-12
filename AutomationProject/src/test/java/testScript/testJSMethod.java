package testScript;

import testBase.TestBase;
import testScript.testJSMethod;
import utility.ScreenshotCapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helper.JSExecutorMethod;

public class testJSMethod 
{
	public static void main(String[] args) throws Exception
	{
		TestBase b = new TestBase();
		TestBase.initialization();
	    WebElement element = TestBase.driver.findElement(By.linkText("Forgotten account?"));
	    JSExecutorMethod.clickElementByJS(element, TestBase.driver); 
	   // JSExecutorMethod.scrollPageDown(TestBase.driver);
	    WebElement element1 = TestBase.driver.findElement(By.linkText("Help"));
	    JSExecutorMethod.scrollintoView(element1, TestBase.driver);
	    JSExecutorMethod.drawBorder(element1, TestBase.driver);
	    ScreenshotCapture.getScreenshot(TestBase.driver, "JStestmethod");
	}
}
