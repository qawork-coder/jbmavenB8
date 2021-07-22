package baseSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

	
	public WebDriver getDriver()

	{
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_91/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
}

//We are going to create a Maven project 
//
//1. launch chrome browser
//2. Open amazon.com and verify whether its open or not 
//3. click on all menu 
//4. click on amazon music
//5. click on amazon music unmilmited and verify its open or not 
