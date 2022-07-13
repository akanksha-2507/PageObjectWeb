package com.petClinicAutomation.core;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestException;
import com.petClinicAutomation.utilities.TestCapture;
import com.petClinicAutomation.utilities.TestConfig;

public  class TestFactory
{
	public static WebDriver driver;			

	public static void launchApplication(String bwsrNmae)
	{
		if(bwsrNmae.equals("chrome")){
			WebDriverManager.chromedriver().setup();			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(bwsrNmae.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();			
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Wrong browser");
		}

		driver.get(TestConfig.getConfigDetails().get("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	public static void webElementClick(WebElement element)
	{

		if(!element.isEnabled())
			throw new TestException(element.getText()+" is not clicked as It is disabled");

		try
		{
			highLight(element);
			element.click();
		}
		catch(Exception e)
		{
			TestCapture.CaptureScreenshot(TestFactory.driver, element.getText());
		}
	}


	public static void webElementSendKeys(WebElement element, String str) throws TestException
	{
		if(!element.isEnabled())
			throw new TestException("WebElement "+element+" is not editabe as It is disabled");

		try
		{
			highLight(element);
			element.sendKeys(str);
		}
		catch(Exception e)
		{

		}
	}


	public static void highLight(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)TestFactory.driver; 
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid yellow;');", element);
		try 
		{
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		} 

	}

	public static boolean isElementDisplayed(WebElement element)
	{		
		try{
			element.isDisplayed();
			return true;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return false;
	}

	public static void select(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

}
