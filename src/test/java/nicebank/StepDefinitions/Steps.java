package nicebank.StepDefinitions;

import cucumber.api.java.en.*;
import nicebank.Money;
import support.KnowsTheDomain;
import cucumber.api.PendingException;
import cucumber.api.Transform;

import org.junit.*;

import transforms.MoneyConverter;

public class Steps {

	/*
    KnowsTheDomain helper;

    public Steps() {
      helper = new KnowsTheDomain();
    }

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(
                                  @Transform(MoneyConverter.class) Money amount) 
                                                                throws Throwable {
        helper.getMyAccount().deposit(amount);

        Assert.assertEquals("Incorrect account balance -", 
                                amount, helper.getMyAccount().getBalance()); 
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", 
                                            dollars, helper.getCashSlot().getContents());
    }
    */
}