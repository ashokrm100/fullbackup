package com.DemoCommerce.qa.TestUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.DemoCommerce.qa.TestBase.Base;

public class TakeScreenShotonError extends Base {
	public TakeScreenShotonError()
	{
		super();
	}
	
	public String onErrorScreenShot(String methodname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("user.dir")+ "//screenshots//" +methodname+System.currentTimeMillis() + ".png";
		FileUtils.copyFile(src,new File(currentdir ));
		return currentdir;
	
		
	}

}
