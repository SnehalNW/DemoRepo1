package com.cg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.TestData;

public class Test1 
{
	@Test(dataProvider="getData")
	public void testMethod(String name, String role)
	{
		System.out.println(name+"\t"+role);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return TestData.getData("src/test/resources/DemoExcel.xlsx","Sheet1");
	}

}
