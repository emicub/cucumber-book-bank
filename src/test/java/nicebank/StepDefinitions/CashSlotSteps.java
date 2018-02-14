package nicebank.StepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import nicebank.CashSlot;
import support.KnowsTheCashSlot;


public class CashSlotSteps {

	  CashSlot cashSlot;

	  public CashSlotSteps(CashSlot cashSlot) {
	      this.cashSlot = cashSlot;
	  }
	
    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable 
    {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, cashSlot.getContents());
    }
}
