package Pom_Pagefactory_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page2 {
	@FindBy (xpath = "//td[text()='Enter Time-Track']") private WebElement text;
	
	
	public Home_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	public String verifytext ()	{
		String aqct = text.getText();
		return aqct;
	}

}
