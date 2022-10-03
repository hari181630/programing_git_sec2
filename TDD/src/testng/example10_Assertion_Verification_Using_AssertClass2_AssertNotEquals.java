package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example10_Assertion_Verification_Using_AssertClass2_AssertNotEquals {

	
	@Test
	public void AssertNotEquals()
	{
		String actResult="TCS";
		String expResult = "IRB";
		Assert.assertNotEquals(actResult, expResult,"Failed: both results are same: ");		
	}
	@Test
	public void AssertNotEquals1()
	{
		String act="TCS";
		String exp="tc";
		Assert.assertNotEquals(act, exp);
	}
	
	
	
	
	
	
	
	
	
	
	
}
