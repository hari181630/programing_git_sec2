package framework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Suite_Sample3 {
	@Test
	public void TC5() 
	{
		Reporter.log("running TC5..",true);
	}
	
	@Test
	public void TC6() 
	{	Assert.fail();
		Reporter.log("running TC6..",true);
	}
}
