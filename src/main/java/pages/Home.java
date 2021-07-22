package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	// 1.constructor
	// 2. Page Objects
	// 3. Methods that will be interacting with page objects

	WebDriver driver; // created a local reference of driver variable

	public Home(WebDriver driver)// Constructor
	{
		this.driver = driver;// assign the local driver variable with foreign driver
		PageFactory.initElements(driver, this); //initialise the elements
	}

//	WebELement signIN=driver.findElement(By.Id("nav-link-accountList")).isDisplayed();

	// Page object

	// Page factory pattern

	@FindBy(id = "nav-link-accountList")
	public WebElement signIN;

	// Methods

	public void homePageVerification() {
		System.out.println(signIN.isDisplayed());
	}

}
