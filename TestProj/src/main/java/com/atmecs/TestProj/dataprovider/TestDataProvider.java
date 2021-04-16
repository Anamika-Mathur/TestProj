package com.atmecs.TestProj.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.TestProj.constants.FileConstant;
import com.atmecs.TestProj.utils.ProvideData;

/**
 * The class is used for creating the data provider for receiving the value of excel file
 * @author amrut.dash
 *
 */

public class TestDataProvider {
	@DataProvider(name = "headerData")
	public Object[][] testData() {
		ProvideData provideData = new ProvideData(FileConstant.TESTDATA_FILE);
		Object[][] getData = provideData.testData(0);
		return getData;
	}
}
