package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword2_Priority2 {

	@Test(priority=1)    
	public void TC2()
	{
		Reporter.log("running TC2.......",true);
	}

	@Test(priority=2)
	public void TC1()
	{
		Reporter.log("running TC1.......",true);
	}
	
	
	
	
	
	
}
