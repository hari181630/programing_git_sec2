package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example10_Assertion_Verification_Using_AssertClass1_AssertEquals {

	
//	@Test
//	public void TC1() 
//	{
//		String act="";
//		String exp="";
//		if(act.equals(exp)) 
//		{
//			System.out.println("Pass");
//		}
//		else 
//		{
//			System.out.println("Fail");
//		}		
//		//line 12-19: Verification		
//	}
//	
	@Test
	public void AssertEquals()
	{
		String actResult="Hi";
		String expResult = "Hello";
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff: ");		
	}
	@Test
	public void AssertEquals1()
	{
		String act="Hari";
		String exp="Hari";
		Assert.assertEquals(act,exp,"Failed: both results are same: " );
		
	}
	
	
	
	
}
