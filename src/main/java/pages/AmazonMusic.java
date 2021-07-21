package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMusic {

	WebDriver driver; // created a local reference of driver variable

	public AmazonMusic(WebDriver driver)// Constructor
	{
		this.driver = driver;// assign the local driver variable with foreign driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@alt='Digital Music']")
	public WebElement amazonMusicHdr;

	public void amazonMusicPageVerification() {
		System.out.println(amazonMusicHdr.isDisplayed());
	}

}
