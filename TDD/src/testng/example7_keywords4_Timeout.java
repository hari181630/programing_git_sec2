package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example7_keywords4_Timeout {
	@Test(timeOut=5000,invocationCount=2)		
	public void TC1() throws InterruptedException
	{
		Thread.sleep(8000);
		Reporter.log("running TC1.......",true);		
	}	
	
	
	@Test(timeOut=4000)		
	public void TC2() 
	{	
		Reporter.log("running TC1.......",true);		
	}
}
