package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageFactory {
	
	@FindBy(xpath = "//a[@href=\\\"/web/index.php/admin/viewAdminModule\\\"]")
	WebElement link_admin;
	
	WebDriver driver;
	public HomepageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void check_admin_linkisDisplay() {
		link_admin.isDisplayed();
	}

}
