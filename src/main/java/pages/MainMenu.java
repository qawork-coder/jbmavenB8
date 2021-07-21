package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu {
	
	
	WebDriver driver; // created a local reference of driver variable

	public MainMenu(WebDriver driver)// Constructor
	{
		this.driver = driver;// assign the local driver variable with foreign driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-hamburger-menu")
	public WebElement menuIcon;

	@FindBy(xpath = "(//*[text()='Amazon Music'])[2]")
	public WebElement amazonMusicTile;

	@FindBy(xpath = "//*[text()='Amazon Music Unlimited']")
	public WebElement amazonMusicUnliTile;

	public void menuNavigation() {
		menuIcon.click();
		amazonMusicTile.click();
		amazonMusicUnliTile.click();
	}

}
