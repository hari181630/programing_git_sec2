package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_Keyword5_DependsOnMethod2 {
	@Test        
	public void login1()
	{
		Reporter.log("running login1 test case.......",true);
	}
	
	@Test        
	public void login2()
	{
		Assert.fail();
		Reporter.log("running login2 test case.......",true);
	}

	@Test(dependsOnMethods= {"login1","login2"})		
	public void logout()
	{
		Reporter.log("running logout test case.......",true);
	}
}
