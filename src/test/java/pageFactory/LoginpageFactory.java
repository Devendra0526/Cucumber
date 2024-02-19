package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageFactory {
	
	@FindBy(name = "username")
	WebElement text_username;
	@FindBy(name = "password")
	WebElement text_password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement button_login;
	
	
	WebDriver driver;
	public LoginpageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_UserId(String username) {
		text_username.sendKeys(username);
	}
	
	public void enter_Pass(String pass) {
		text_password.sendKeys(pass);
	}
	
	public void click_Login_Button() {
		button_login.click();
	}
	
	

}
