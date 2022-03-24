package starter.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("i am in login page");
    }
    @When("I input valid username and valid password")
    public void iInputValidUsernameAndValidPassword(){
        System.out.println("username");
        System.out.println("password");
    }
    @And("click login button")
    public void click_login_button(){
        System.out.println("");
    }
    @Then("I go to homepage")
    public void i_go_to_homepage(){
        System.out.println("");
    }
    @When("I input null username and valid password")
    public void i_input_null_username_and_valid_password(){
        System.out.println("null username");
    }
    @Then("I will get error message")
    public void i_will_get_error_message(){
        System.out.println("error message");
    }
}
