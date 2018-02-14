
package hooks;

import org.javalite.activejdbc.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import nicebank.Account;
import nicebank.TransactionQueue;

public class ResetHooks 
{
    @Before(order = 1)
    public void reset() 
    {
        if (!Base.hasConnection()) {
            Base.open(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost/bank",
                    "teller", "password");
        }
        Account.deleteAll();
        TransactionQueue.clear();
    }  
}
