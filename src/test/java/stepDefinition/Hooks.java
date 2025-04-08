package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;
import utils.Screenshots;

public class Hooks{
	static WebDriver driver;
	static WebDriverWait wait;
	
	@Before
	public void setup() {
		driver=DriverManager.getDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	@After
	public void tearDown() {
		
		driver.quit();
	}
	

}
