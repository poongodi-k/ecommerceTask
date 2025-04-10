package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.AddressFillingPage;
import pages.ProductPage;

public class AddressFillingStepDefinition {
	WebDriver driver = Hooks.driver;
	AddressFillingPage address;
	
	@Then("user fill first name")
	public void userFillFirstName() throws InterruptedException {
		address = new AddressFillingPage(driver, Hooks.wait);
		Thread.sleep(2000);
		address.sendFirstName("poongodi");
	    
	}
	@Then("user fill last name")
	public void userFillLastName() throws InterruptedException {
		Thread.sleep(2000);
		address.sendLastName("kavirajan");
	    
	}
	@Then("user fill zipcode")
	public void userFillZipcode() throws InterruptedException {
		Thread.sleep(2000);
		address.sendPostalCode("605008");
	    
	}
	@Then("user click continue button")
	public void userClickContinueButton() throws InterruptedException {
		Thread.sleep(2000);
		address.clickContinueBtn();
		Thread.sleep(2000);
		
	    
	}
	@Then("user click finish button")
	public void userClickFinishButton() throws InterruptedException {
		address.clickFinishBtn();
		Thread.sleep(2000);
	}
}
