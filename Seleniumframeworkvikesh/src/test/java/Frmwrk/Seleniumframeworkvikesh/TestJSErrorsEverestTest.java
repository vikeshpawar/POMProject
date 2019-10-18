package Frmwrk.Seleniumframeworkvikesh;

import org.testng.annotations.Test;

import Browsers.BrowserFactory;

public class TestJSErrorsEverestTest extends DriverActions {
	
	
  @Test
  public void  collectJSErrors() {
	BrowserFactory brw = new BrowserFactory() ;   
	 brw.provideBrowser("chrome"); 
	  getDriver().get("http://questlite.test.quinstreet.net/qcm/settings.jsp#!/");
	  
  }
}
