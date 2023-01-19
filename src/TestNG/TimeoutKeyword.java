package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeyword {
 @Test
 public void Tc1() {
	 Reporter.log("amazone getting more time so we used timeout",true);
	 
 }
 @Test (timeOut = 60000)
 public void Tc2() {
	 Reporter.log("123456789",true);
	 
 }
}
