package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
	
	public homePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	public void givetext() {
		String expT = "Enter Time-Track";
		String acqT = text.getText();
		
		
		
		if (acqT.equals(expT)) {
			System.out.println("tc will pass");
			
		}
		else { 
			System.out.println("tc will fail");
	
	}
	
	
	}

	public String verifyText() {
		// TODO Auto-generated method stub
		return null;
	}
	}
