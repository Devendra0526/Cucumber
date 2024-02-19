package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class LoginTest {
//	
//	WebDriver driver ;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.getProperty("webdriver.chrome.driver",
//				"C:\\Users\\ACER\\Eclipse Automation\\BDDCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
//	    Thread.sleep(200);
//	}
//
//	@When("user enter username and password")
//	public void user_enter_username_and_password() throws InterruptedException {
//	    driver.findElement(By.name("username")).sendKeys("Admin"); Thread.sleep(200);
//		driver.findElement(By.name("password")).sendKeys("admin123"); Thread.sleep(200);
//	}
//	
//	@And("user click on login button")
//	public void user_click_on_login_button() throws InterruptedException {
//	    driver.findElement(By.xpath("//button[@type='submit']")).click(); Thread.sleep(200);
//	}
//
//	@Then("user is navigate to the home page")
//	public void user_is_navigate_to_the_home_page() {
//	    driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]")).isDisplayed();
//		driver.close();
//		driver.quit();
//	}
//
//}
