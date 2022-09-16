package javaSelenium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class Chrometest1 {

	
	@Test
	public void test() throws MalformedURLException {
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		URL url =new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	   System.out.println("title of the page: "+driver.getTitle());
	   
	   driver.quit();

	}

}
