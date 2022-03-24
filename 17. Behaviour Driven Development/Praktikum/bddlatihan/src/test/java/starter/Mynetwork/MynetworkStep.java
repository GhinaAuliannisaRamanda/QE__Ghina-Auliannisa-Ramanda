package starter.Mynetwork;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MynetworkStep {
    @Given("I go to my network invitation page")
    public void iGoToNetworkPage(){System.out.println("i am on my network page invitation");}

    @When("I see invitation connection")
    public void iSeeInvitation(){System.out.println();}

    @And("I click accept")
    public void iAccept(){System.out.println();}

    @Then("I got new connection")
    public void iGotNew(){System.out.println("You have new connections");}

    @And("I click ignore")
    public void iIgnore(){System.out.println();}

    @Then("i got nothing change")
    public void iNothingChange(){System.out.println("There Nothing changes");}
}
