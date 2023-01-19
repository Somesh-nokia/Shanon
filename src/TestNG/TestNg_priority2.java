package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_priority2 {
	@Test (priority = 3)
	public void testCase1() {
	Reporter.log("test 1st",true);
	
	
	}
	@Test (priority = 2)
	public void testCase2() {
		Reporter.log("test 2nd",true);
		
	}
	@Test (priority = 1)
	public void testCase3() {
		Reporter.log("test 3rd",true);
	}
	
	
	}
