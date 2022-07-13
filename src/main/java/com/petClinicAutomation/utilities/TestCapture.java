package com.petClinicAutomation.utilities;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TestCapture {

	public static void CaptureScreenshot(WebDriver driver, String Screenshotname)
	{
		//Take screenshot and store as a file format

		String path =  System.getProperty("user.dir");

		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(src, new File(path+"/screenshots"+Screenshotname));

		}

		catch(IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
