package Frmwrk.Seleniumframeworkvikesh;

import org.openqa.selenium.WebDriver;

import Browsers.Browser;
import Browsers.BrowserFactory;
import Browsers.FirefoxBrowser;
import Browsers.IEBrowser;

/**
 * Hello world!
 *
 */

public class DriverActions 
{
	static Browser browser ;
	static WebDriver driver ;
    public static void launchBrowser( String brwsr )
    {
    	browser = BrowserFactory.provideBrowser(brwsr);
    	setDriver (browser.getDriver());
    	
    }
	public  WebDriver getDriver() {
		return driver;
	}
	public static  void setDriver(WebDriver driver) {
		DriverActions.driver = driver;
	}
    
	public void switchTabs(){
		for (String tab : driver.getWindowHandles()) {
			if(!driver.getWindowHandle().equals(tab))
				driver.switchTo().window(tab);
		}
	}
	
	public void closeTabs(){
		for (String tab : driver.getWindowHandles()) {
				driver.quit();
		}
	}
	
}
