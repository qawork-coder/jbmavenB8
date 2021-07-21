package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.AmazonMusic;
import pages.Home;
import pages.MainMenu;

public class First extends Base {

	// 1. create a local webdriver variable
	// 2. Create the page object
	// 3. Need to bring driver from BaseSetup File
	// 4. initialise the memory to page objects
	// 5. write the test case

	WebDriver driver;
	Home homeobj; // declared the page objects
	MainMenu menuObj;
	AmazonMusic musicObj;

	@BeforeClass
	public void initialise() {

		driver = getDriver();
		homeobj = new Home(driver);
		menuObj = new MainMenu(driver);
		musicObj = new AmazonMusic(driver);

	}

	@Test
	public void tc1() {
		homeobj.homePageVerification();
		menuObj.menuNavigation();
		musicObj.amazonMusicPageVerification();
	}

//	Home homeobj=new Home();
//	MainMenu menuObj=new MainMenu();
//	AmazonMusic musicObj=new AmazonMusic();

}
