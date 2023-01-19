package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Invocation_Count {
	@Test (invocationCount = 10)
	public void Tc2() {
		Reporter.log("don't know ",true);
	}

}
