package support;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MyWebDriver extends EventFiringWebDriver{
    public MyWebDriver()
    {
		super(createDriver());        		
    }

	public static FirefoxDriver createDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
    	File pathToBinary = new File("C:\\Users\\emCub1\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
    	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
    	FirefoxProfile firefoxProfile = new FirefoxProfile();
    	
    	FirefoxOptions options = new FirefoxOptions();
    	options.setBinary(ffBinary);
    	options.setProfile(firefoxProfile);
		FirefoxDriver _driver = new FirefoxDriver(options);
		return _driver;
	}
}