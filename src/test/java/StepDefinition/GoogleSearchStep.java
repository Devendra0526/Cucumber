package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
public class GoogleSearchStep {

	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step- Browser is open");
		System.getProperty("webdriver.chrome.driver",
				"C:/Users/ACER/Eclipse Automation/BDDCucumber/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user is on google search  page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside step- user is on google page");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() throws InterruptedException  {
		System.out.println("Inside step- user enter text in search box");
		driver.findElement(By.name("q")).sendKeys("Automationstep step by step");
		Thread.sleep(2000);

	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException  {
		System.out.println("Inside step- user hit the enter the button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigate to search result")
	public void user_is_navigate_to_search_result() throws InterruptedException  {
		System.out.println("Inside step- user navigate to search result");
		driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}*/
