package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword2_Priority5 {
	@Test          //0
	public void TC2()
	{
		Reporter.log("running TC2.......",true);
	}

	@Test(priority=3)		 //3
	public void TC1()
	{
		Reporter.log("running TC1.......",true);
	}
}
