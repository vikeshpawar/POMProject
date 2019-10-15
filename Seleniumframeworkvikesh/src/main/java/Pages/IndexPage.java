package Pages;

import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class IndexPage {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	
	Properties p = new Properties() ; 
	p.load(new FileReader(System.getProperty("user.dir").toString() + "\\resources\\app.properties")) ; 
	
	
System.out.println(	p.get("AdminUsername"));
	}
	
}
	
