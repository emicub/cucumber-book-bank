package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;


import nicebank.AtmServer;
import nicebank.CashSlot;
import support.TestAccount;
import support.KnowsTheCashSlot;


public class ServerHooks {
    public static final int PORT = 8887;
	//public static final int PORT = 9988;

    private AtmServer server;
	private TestAccount testAccount;
	private CashSlot cashSlot;

    public ServerHooks(CashSlot cashSlot, TestAccount testAccount) 
    {
        this.cashSlot = cashSlot;
        this.testAccount = testAccount;
    }
    
    @Before
    public void startServer() throws Exception {
    	System.out.println("This will run before the Scenario");
    	
    	// Esto se ejecuta bien cuando ejecuto el archivo .feature,
    	// pero no con >mvn clean test 
        server = new AtmServer(PORT, cashSlot, testAccount);
        server.start();
    }

    @After
    public void stopServer() throws Exception {
    	System.out.println("This will run after the Scenario");
        server.stop();
    }
    
}