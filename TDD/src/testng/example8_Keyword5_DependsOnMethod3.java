package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_Keyword5_DependsOnMethod3 {
	@Test        
	public void login1()
	{
		Assert.fail();
		Reporter.log("running login1 test case.......",true);
	}
	
	@Test(dependsOnMethods= {"login1"})        
	public void login2()
	{
		Reporter.log("running login2 test case.......",true);
	}

	@Test(dependsOnMethods= {"login2"})		
	public void logout()
	{
		Reporter.log("running logout test case.......",true);
	}
}
