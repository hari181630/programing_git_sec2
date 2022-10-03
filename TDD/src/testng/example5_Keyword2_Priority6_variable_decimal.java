package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword2_Priority6_variable_decimal {
	int a=5;
	
	@Test(priority=5)         
	public void TC2()
	{
		Reporter.log("running TC2.......",true);
	}

	@Test(priority=(int) 3.5)		
	public void TC1()
	{
		Reporter.log("running TC1.......",true);
	}
}
