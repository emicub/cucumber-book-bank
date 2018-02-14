
package nicebank.StepDefinitions;

import cucumber.api.java.en.*;
import nicebank.Money;
import cucumber.api.Transform;

import org.junit.*;

import support.TestAccount;
import transforms.MoneyConverter;

public class AccountSteps {
	TestAccount testAccount;

    public AccountSteps(TestAccount testAccount) {
        this.testAccount = testAccount;
    }
      
    @Given("^my account has been credited with (\\$\\d+\\.\\d+)$")
    public void myAccountHasBeenCreditedWith$(
                                @Transform(MoneyConverter.class) Money amount) 
                                                              throws Throwable {
    	testAccount.credit(amount);
    }

    @Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
        public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable 
    {
            int timeoutMilliSecs = 3000;
            int pollIntervalMilliSecs = 100;

            while (!testAccount.getBalance().equals(amount) && timeoutMilliSecs > 0)
            {
                Thread.sleep(pollIntervalMilliSecs);
                timeoutMilliSecs -= pollIntervalMilliSecs;
            }

            Assert.assertEquals(
                    "Incorrect account balance -",
                    amount,
                    testAccount.getBalance());
    }
}