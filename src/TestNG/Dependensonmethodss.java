package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependensonmethodss {
	@Test
	public void verifyloginpage() {
		Reporter.log("open succesfully page,true");
				
		
	}
	@Test (dependsOnMethods = {"verifyloginpage"})
	public void verifylogoutpage() {
		Reporter.log("succesfully logout page,true");
	}

}
