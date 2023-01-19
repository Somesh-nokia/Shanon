package Pom_Pagefactory_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page1 {
	@FindBy(xpath = "//input[@id='username']") private WebElement un;
	@FindBy (xpath = "//input[@class='textField pwdfield']") private WebElement pwd;
	@FindBy (xpath = "//div[text()='Login ']") private WebElement logbutton;
	
	public Login_page1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}	
	public void userName(String username) {
		un.sendKeys(username);
	}
	public void passWord (String password) {
		pwd.sendKeys(password);
		
	}
	
	public void clicklogin() {
		logbutton.click();
	}

}
