package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1 {
	

		@Test
		public void TC1() {
			Reporter.log("Hello",true);
		}
		

	}


