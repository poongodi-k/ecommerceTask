package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	static WebDriverWait wait;

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement usernameField;
	@FindBy(id = "password")
	private WebElement passwordField;
	@FindBy(id = "login-button")
	private WebElement loginButton;

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getloginButton() {
		return loginButton;
	}
	
	public void sendUserName(String name) {
		usernameField.sendKeys(name);
	}

	public void sendPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickSubmitBtn() {
		loginButton.click();
	}


}
