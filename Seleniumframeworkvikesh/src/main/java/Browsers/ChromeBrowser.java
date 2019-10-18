package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Frmwrk.Seleniumframeworkvikesh.DriverActions;

public class ChromeBrowser implements Browser {

	WebDriver driver ; 
	public ChromeBrowser(WebDriver driver ) {
		this.driver = driver ; 
		try {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikeshpawar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		}
		catch (IllegalStateException e ){
			// System.setProperty("webdriver.chrome.driver", "C:\\Users\\vpawar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		}
		
		finally {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vpawar\\Documents\\Bluetooth\\chromedriver_win32\\chromedriver.exe");
	
		}
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 setDriver(driver);
	}
	private void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		DriverActions.setDriver(driver) ;
	}
	public WebDriver getDriver( ) {
		// TODO Auto-generated method stub
		return driver;
	}
	
	

	

}
