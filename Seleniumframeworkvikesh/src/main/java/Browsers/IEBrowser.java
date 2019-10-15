package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser implements Browser {

	WebDriver driver ; 
	public IEBrowser(WebDriver driver ) {
		this.driver = driver ; 
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\vikeshpawar\\Downloads\\IEDriverServer_Win32_3.14.0(1)\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
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
