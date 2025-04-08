package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Screenshots;


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
	
	@Then("user enter the incorrect username")
	public void userEnterTheIncorrectUsername() throws InterruptedException {
	    Thread.sleep(2000);
	    login.sendUserName("poongodi");
	}
	@Then("user enter the incorrect password")
	public void userEnterTheIncorrectPassword() throws InterruptedException {
		Thread.sleep(2000);
		login.sendPassword("poo1235");
	    
	}
	@Then("click login button")
	public void clickLoginButton() throws InterruptedException {
		
		login.clickSubmitBtn();
		try {
			WebElement errorElmt = Hooks.wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/h3"))));
			if (errorElmt.isDisplayed()) {
				Screenshots.getScreenshot(driver,"Loginfail");
			}

		} catch (Exception e) {
			System.out.println("user login successfull");
			System.out.println(e.getMessage());
		}

		
		

}
}
