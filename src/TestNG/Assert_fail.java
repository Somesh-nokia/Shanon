package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
@Test 
public void tc1() {
	Reporter.log("tc1 pass",true);
	Assert.fail();
	Reporter.log("Tc1",true);
}
@Test 
public void tc2() {
	Reporter.log("tc2 pass",true);

}
}