package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements Browser {

	WebDriver driver ; 
	public FirefoxBrowser(WebDriver driver ) {
		this.driver = driver ; 
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\vikeshpawar\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 setDriver(driver);
	}
	private void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver = driver ;
	}
	public WebDriver getDriver( ) {
		// TODO Auto-generated method stub
		return driver;
	}
	
	

	

}
