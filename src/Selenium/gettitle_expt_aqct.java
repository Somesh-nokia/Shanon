package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle_expt_aqct {
public static void main (String [] args ) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
	 WebDriver someshwar = new ChromeDriver();
	
	someshwar.get("https://www.amazon.in/");
	//get titile method
	String s1 = someshwar.getTitle();

      System.out.println(s1);
      //except
      String excpT = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More  Amazon.in";
      String aqulT = someshwar.getTitle();
      
      
      
      
     if (excpT.equals(aqulT))  {
    	  
    	  System.out.println("tc is pPASS");
      
      }
      else {
    	  System.out.println("tc will fail");
      
      
      
      }




}
}
