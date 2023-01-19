package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnno_Priority1 {
	
	@Test(priority = 3)
	public void TC1() {
		Reporter.log("running TC 1",true);
	}
	@Test(priority = 1)
	public void TC2() {
		Reporter.log("running TC 2",true);
	}
	@Test(priority = 2)
	public void TC3() {
		Reporter.log("running TC 3",true);
		
	}
	}


