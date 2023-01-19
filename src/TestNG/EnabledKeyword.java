package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
	@Test  
	public void Tc1() {
		Reporter.log("tc1 pass",true);
	}
	@Test (enabled = true)
	public void Tc2() {
		Reporter.log("tc2 pass",true);
	}
}
