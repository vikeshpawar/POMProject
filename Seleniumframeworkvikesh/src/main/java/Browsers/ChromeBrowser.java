package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Browser {

	WebDriver driver ; 
	public ChromeBrowser(WebDriver driver ) {
		this.driver = driver ; 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikeshpawar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
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
