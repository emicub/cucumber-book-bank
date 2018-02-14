package nicebank.StepDefinitions;

import cucumber.api.java.en.When;
import nicebank.Teller;
import support.TestAccount;
import support.AtmUserInterface;
import support.KnowsTheTeller;

import cucumber.api.java.en.*;


public class TellerSteps
{

  TestAccount testAccount;
  Teller teller;

  public TellerSteps(AtmUserInterface teller, TestAccount testAccount) 
  {
      this.teller = teller;
      this.testAccount = testAccount;
  }
      
  @When("^I withdraw \\$(\\d+)$")
  public void iWithdraw$(int amount) throws Throwable {
      teller.withdrawFrom(testAccount, amount);
  }
}