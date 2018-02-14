package support;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;

import org.javalite.activejdbc.Base;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.Teller;
import nicebank.AutomatedTeller;

public class KnowsTheDomain {
	/*
    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;
    private EventFiringWebDriver webDriver;
    
    public KnowsTheDomain() 
    {
        if (!Base.hasConnection())
        {
            Base.open(
                "com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost/bank",
                "teller", "password");
            
            Account.deleteAll();
        }
    }    

    public Account getMyAccount() {
      if (myAccount == null){
        myAccount = new Account(1234);
        myAccount.saveIt();
      }

      return myAccount;
    }

    public Teller getTeller() {
      if (teller == null){
        teller = new AtmUserInterface();
      }

      return teller;
    }

    public CashSlot getCashSlot() {
      if (cashSlot == null){
        cashSlot = new CashSlot();
      }
  
      return cashSlot;
    }
    
    public EventFiringWebDriver getWebDriver() {
        if (webDriver == null){
        	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.19.1-win64\\\\geckodriver.exe");
        	File pathToBinary = new File("C:\\Users\\emCub1\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        	FirefoxProfile firefoxProfile = new FirefoxProfile();
        	
        	FirefoxOptions options = new FirefoxOptions();
        	options.setBinary(ffBinary);
        	options.setProfile(firefoxProfile);
    		FirefoxDriver _driver = new FirefoxDriver(options);
            this.webDriver = new EventFiringWebDriver(_driver);        	          
        }
        return webDriver;
    }    
    */
}