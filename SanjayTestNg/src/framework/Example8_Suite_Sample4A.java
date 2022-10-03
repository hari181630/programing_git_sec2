package framework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Suite_Sample4A {

	@Test
	public void TC7() 
	{
		Reporter.log("running TC7..",true);
	}
	
	@Test
	public void TC8() 
	{
		Assert.fail();
		Reporter.log("running TC8..",true);
	}
	
	
	
	
	
	
	
	
}
