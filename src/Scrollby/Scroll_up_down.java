package Scrollby;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {
           static public void main (String args []) throws Throwable {
           System.setProperty("webdriver.chrome.driver","C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
           WebDriver somesh = new ChromeDriver();
           somesh.get("https://www.meesho.com/");
           somesh.manage().window().maximize();

           Thread.sleep(2000);
           JavascriptExecutor jre =(JavascriptExecutor)somesh;
           jre.executeScript("window.scrollBy(0,8000);");
           Thread.sleep(2000);
           jre.executeScript("window.scrollBy(0,-7500);");
                      System.out.println("some changes from Team lead ");









}
}
