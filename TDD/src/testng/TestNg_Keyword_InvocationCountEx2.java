package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Keyword_InvocationCountEx2 {
	@Test(invocationCount=3)
	public void TC1()
	{
		Reporter.log("True",true);
	}

}
