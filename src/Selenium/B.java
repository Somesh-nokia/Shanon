package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\shingsss\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver W = new EdgeDriver();
	W.get("https://www.bing.com/search?q=key+of+edge+selenium&qs=n&form=QBRE&sp=-1&pq=key+of+edge+selenium&sc=0-20&sk=&cvid=9243722C65D34750B06FDBF981B7C38C&ghsh=0&ghacc=0&ghpl=");
	}

}
