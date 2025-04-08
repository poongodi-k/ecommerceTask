package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class ProductStepDefinition {
	WebDriver driver;
	ProductPage product;
	
	@Given("user add product to the cart")
	public void userAddProductToTheCart() throws InterruptedException {
		product.clickAddToCartButton();
	   
	}
}
