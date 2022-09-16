package javaSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Edgetest1 {
	
@Test
	
	public void testedge() throws MalformedURLException {
		
		
       DesiredCapabilities dc = DesiredCapabilities.edge();
		
		URL url =new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://www.google.co.in/");
		
	   System.out.println("title of the page: "+driver.getTitle());
	   
	   driver.quit();
	}

}
