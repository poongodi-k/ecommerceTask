package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class ProductStepDefinition {
	WebDriver driver = Hooks.driver;
	ProductPage product;
	
	@Then("user add product to the cart")
	public void userAddProductToTheCart() throws InterruptedException {
		product = new ProductPage(driver, Hooks.wait);
		product.clickAddToCartButton();

	}
	
	@Then("user click cart container button")
	public void userClickCartContainerButton() throws InterruptedException {
	    product.clickCartContainer();
	}
	@Then("user click checkout button")
	public void userClickCheckoutButton() throws InterruptedException {
		product.clickCheckoutBtn();
	   
	}


}
