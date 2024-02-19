package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomepageFactory;
import pageFactory.LoginpageFactory;

public class LoginTestFactory {

	WebDriver driver;
	LoginpageFactory login;
	HomepageFactory home;

	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("LoginTestFactory");

		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\ACER\\Eclipse Automation\\BDDCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password(String username, String pass) {
		login = new LoginpageFactory(driver);
		login.enter_UserId(username);
		login.enter_Pass(pass);
	

//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		login.click_Login_Button();

//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		home.check_admin_linkisDisplay();
//		driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]")).isDisplayed();

		driver.close();
		driver.quit();
	}
}
