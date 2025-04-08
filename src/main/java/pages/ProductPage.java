package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	static WebDriverWait wait;

	public ProductPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	 WebElement addToCartButton;
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button")
	 WebElement addToCartButton2;
	
	public void clickAddToCartButton() throws InterruptedException {
		addToCartButton.click();
		Thread.sleep(2000);
        addToCartButton2.click();
		}
}
