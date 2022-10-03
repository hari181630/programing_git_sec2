package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_keyword_Priority {
	

	@Test(priority=-1)
	public void TC1()
	{
		Reporter.log("running TC1.......",true);
	}
	@Test(priority=-5)    
	public void TC2()
	{
		Reporter.log("running TC2.......",true);
	}

	
}
