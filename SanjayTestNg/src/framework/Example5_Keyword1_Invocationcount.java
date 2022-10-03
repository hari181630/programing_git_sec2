package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword1_Invocationcount {
	@Test(invocationCount=2)
	public void TC1()
	{
		Reporter.log("running TC1.......",true);
	}
}
