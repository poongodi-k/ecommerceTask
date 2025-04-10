package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressFillingPage {
	WebDriver driver;
	static WebDriverWait wait;
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	@FindBy(id = "last-name")
	private WebElement lastName;
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/form/div[2]/input")
	private WebElement continueBtn;
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")
	WebElement finishBtn;
	
	public AddressFillingPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstName() {
		return firstName;
	}

    public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public void sendFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void sendLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void sendPostalCode(String code) {
		postalCode.sendKeys(code);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
	public void clickFinishBtn() {
		finishBtn.click();
	}

	
}
