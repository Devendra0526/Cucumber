package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*import pages.LoginPage;

public class LoginTestPOM {

	WebDriver driver;
	LoginPage login;

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("I am inside in LoginTestPOM");
		
		System.getProperty("webdriver.chrome.driver",
				"C:\Users\ACER\Eclipse Automation\BDDCucumber\src\test\resources\drivers\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enter username and password")
	public void user_enter_username_and_password(String username, String pass) throws InterruptedException {

		login = new LoginPage(driver);

		login.enter_UserId(username); 
		login.enter_Pass(pass); 

//	    driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");     
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {

		login.click_Login_Button(); 

//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		login.check_adminLinkisDisplay();
//		login.click_dropdown_button_user();
//		login.check_logout_buttonisDisplay();
		driver.close();
		driver.quit();
	}
}*/
