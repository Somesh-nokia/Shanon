package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Innvocation_Count2 {
	@Test (invocationCount = 7)
    public void Tc1() {
		Reporter.log("I LOVE MY INDIA",true);
	}
}
