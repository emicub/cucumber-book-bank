
package support;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.java.After;
import hooks.ServerHooks;
import cucumber.api.Scenario;


import nicebank.Account;
import nicebank.Teller;

public class AtmUserInterface implements Teller {
    
    public final EventFiringWebDriver webDriver;
    
    /*
    public AtmUserInterface(){
    	
    	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
    	File pathToBinary = new File("C:\\Users\\emCub1\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
    	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
    	FirefoxProfile firefoxProfile = new FirefoxProfile();
    	
    	FirefoxOptions options = new FirefoxOptions();
    	options.setBinary(ffBinary);
    	options.setProfile(firefoxProfile);
		FirefoxDriver _driver = new FirefoxDriver(options);
        this.webDriver = new EventFiringWebDriver(_driver);
    }*/
    
    
    public AtmUserInterface(){
    	this.webDriver = new MyWebDriver();
    }
    
    
    public void withdrawFrom(Account account, int dollars) {
        try {
            webDriver.get("http://localhost:" + ServerHooks.PORT);
            
            try 
            {
				Thread.sleep(10000);
			} catch (InterruptedException e) 
            {
			}
            webDriver.findElement(By.id("Amount")).sendKeys(String.valueOf(dollars));
            
            try 
            {
				Thread.sleep(10000);
			} catch (InterruptedException e) 
            {
			}
            
            webDriver.findElement(By.id("Withdraw")).click();
            
            try 
            {
				Thread.sleep(10000);
			} catch (InterruptedException e) 
            {
			}
        }
        finally {
            webDriver.close();
        }
    }
}
