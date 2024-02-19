package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ;
	
	By text_username = By.name("username");
	By text_password = By.name("password");
	By button_login = By.xpath("//button[@type='submit']");
	By link_admin = By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]");
//	By dropdown_button_user = By.xpath("//p[@class='oxd-userdropdown-name']");
//	By dropdown_button_logout = By.xpath("//a[@href=\"/web/index.php/auth/logout\"]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void enter_UserId(String username) {
		driver.findElement(text_username).sendKeys(username);
	}
	
	public void enter_Pass(String pass) {
		driver.findElement(text_password).sendKeys(pass);
	}
	
	public void click_Login_Button() {
		driver.findElement(button_login).click();
	}
	
	public void check_adminLinkisDisplay() {
		driver.findElement(link_admin).isDisplayed();
	}
	
//	public void click_dropdown_button_user() {
//		
//		driver.findElement(dropdown_button_user).click();
//	}
//	
//	public void check_logout_buttonisDisplay() {
//		driver.findElement(dropdown_button_logout).isDisplayed();
//	}
	
	public void validLoginUser(String username, String pass) {
		driver.findElement(text_username).sendKeys(username);
		driver.findElement(text_password).sendKeys(pass);
		driver.findElement(button_login).click();
//		driver.findElement(dropdown_button_user).click();
	}
}
