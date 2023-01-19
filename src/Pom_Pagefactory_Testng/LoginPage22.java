package Pom_Pagefactory_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage22 {
 
	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath= "//input[@name='pwd']")private WebElement pwd;
	@FindBy (xpath = "//div[text()='Login ")private WebElement clickLbutton;

	public LoginPage22(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	public void username1(String username){
	un.sendKeys(username);
	}
	public void password1(String password){
	pwd.sendKeys(password);
	}
	public void clicbutton() {
	clickLbutton.click();
	}

	}

