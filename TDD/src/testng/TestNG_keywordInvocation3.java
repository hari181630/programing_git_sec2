package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_keywordInvocation3 {

	
	@Test(invocationCount=3)
	public void Tc1()
	{
		Reporter.log("Hari",true);
	}
	@Test(invocationCount=1)
	public void Tc2()
	{
		Reporter.log("Paraji",true);
	}
	@Test(invocationCount=5)
	public void Tc3()
	{
		Reporter.log("Burewar",true);
	}
	
	
}
