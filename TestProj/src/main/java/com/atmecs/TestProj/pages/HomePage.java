package com.atmecs.TestProj.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.TestProj.constants.FileConstant;
import com.atmecs.TestProj.helpers.CommonUtility;
import com.atmecs.TestProj.utils.ReadPropertiesFile;

public class HomePage {
Properties locators;
CommonUtility commonUtility;
	
	public HomePage(WebDriver driver)
	{
		try {
			locators=ReadPropertiesFile.loadProperty(FileConstant.lOCATORS_FILE);
			commonUtility=new CommonUtility(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateHeaders(String expectedHeaderName) {
		// TODO Auto-generated method stub
		String actualHeaderName=commonUtility.getText(locators.getProperty("loc_header_name").replace("[xxxx]", expectedHeaderName));
		Assert.assertEquals(actualHeaderName,expectedHeaderName);
		System.out.println("the headers of atmecs site:-"+actualHeaderName);
	}
}
