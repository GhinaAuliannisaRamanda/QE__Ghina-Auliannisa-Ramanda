package starter.search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStep {
    @Given("I go to search bar")
    public void iGoToSearchColumn() {
        System.out.println("i am on search column");
    }

    @When("I input valid people name or groups")
    public void iInputvalid() {
        System.out.println("username");
        System.out.println("Random short text");
    }
    @And("I Click Result")
    public void iClickResult(){System.out.println("");}
    @Then("I can see general information")
    public void iCanSee() {System.out.println("");}
    @When("I input random phrasing text or long typing")
    public void i_Input_Random_Phrasing_Text_Or_Long_Typing() {
        System.out.println("Random Phrasing");
        System.out.println("Long Typing");
    }
    @Then("I will get no result found, Try shortening or rephrasing your search")
    public void ICantSeeInformation() {
        System.out.println("no result found, Try shortening or rephrasing your search");
    }
}
