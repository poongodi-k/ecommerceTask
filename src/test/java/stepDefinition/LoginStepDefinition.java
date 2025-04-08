package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.ConfigReader;


public class LoginStepDefinition {
	WebDriver driver;
	LoginPage login;
	@Given("user go to login page")
	public void userGoToLoginPage() {
		driver = Hooks.driver;
		driver.get(ConfigReader.getValue("url"));
		driver.manage().window().maximize();
		login = new LoginPage(driver, Hooks.wait);
	}
	
	@Then("user enter the userName")
	public void userEnterTheUserName() throws InterruptedException {
		Thread.sleep(2000);
		login.sendUserName("standard_user");
		
	   
	}
	@Then("user enter the password")
	public void userEnterThePassword() throws InterruptedException {
		Thread.sleep(2000);
		login.sendPassword("secret_sauce");
	    
	}
	@Then("click login button")
	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		login.clickSubmitBtn();
	   
	}

}
