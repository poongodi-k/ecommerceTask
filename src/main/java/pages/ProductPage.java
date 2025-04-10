package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	static WebDriverWait wait;

	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	 WebElement addToCartButton;
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button")
	 WebElement addToCartButton2;
	@FindBy(id = "shopping_cart_container")
	WebElement cartContainer;
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/a[2]")
	WebElement checkOut;
	
	public ProductPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCartButton() throws InterruptedException {
		addToCartButton.click();
		Thread.sleep(2000);
        addToCartButton2.click();
        Thread.sleep(2000);
	}
        
    public void clickCartContainer() throws InterruptedException {
        cartContainer.click();
        Thread.sleep(2000);
    }
    
    public void clickCheckoutBtn() throws InterruptedException {
    
        checkOut.click();
        Thread.sleep(2000);
        
		}
}
