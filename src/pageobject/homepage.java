package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
WebDriver driver;
	
	@FindBy (id="username") 
	private WebElement UsernameTB;
	

	@FindBy (id="password") 
	private WebElement PasswordTB;
	
	@FindBy (id="submit") 
	private WebElement SubmitTB;
	
	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	public void setcredentials(String EnterUsername, String EnterPassword) {
		UsernameTB.sendKeys(EnterUsername);
		
		PasswordTB.sendKeys(EnterPassword);
	}
	public void login() {
		// TODO Auto-generated method stub
		SubmitTB.click();
	}
	 

}
