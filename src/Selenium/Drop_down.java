package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	 static public void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shingsss\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver somesh = new ChromeDriver();
     
     somesh.get("https://www.facebook.com/");
     Thread.sleep(2000);
     
     somesh.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
     Thread.sleep(2000);
    WebElement day = somesh.findElement(By.xpath("//select[@id=\"day\"]"));
    Thread.sleep(3000);
    Select s = new Select(day);
    s.selectByValue("21");
    WebElement month =somesh.findElement(By.xpath("//select[@id=\"month\"]"));
    Thread.sleep(2000);
    Select m =new Select(month);
    m.selectByVisibleText( "Feb");
    Thread.sleep(4000);
    WebElement year =somesh.findElement(By.xpath("//select[@id=\"year\"]"));
    Thread.sleep(1000);
    Select y = new Select(year);
    y.selectByValue("1994");
    somesh.manage().window().minimize();
    Thread.sleep(1000);
    
    






}

}
