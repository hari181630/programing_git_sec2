package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_keyword_InvocationCount {
		@Test(invocationCount=4)
		public void TC()
		{
			Reporter.log("Running TC1.....",true);
		}
}
