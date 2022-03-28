package Starter.stepdevinitions;

import Starter.user.GET;
import Starter.user.Post;
import Starter.user.PostGenerateToken;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserStep {

    public String userId, token;

    @Steps
    GET get;

    @Steps
    Post post;

    @Steps
    PostGenerateToken postGenerateToken;

    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser() {
        post.setPostEndpoint();
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() {
        post.requestPostDetailUser();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
        get.validateStatusCode(arg0);
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser() {
        post.validateDataDetail();
    }

    @And("get userId for other request")
    public void getUserIdForOtherRequest() {
        this.userId = post.getUserId();
    }

    @When("I request POST detail user with invalid password")
    public void iRequestPOSTDetailUserWithInvalidPassword() {
        post.requestPostInvalid();
    }

    @And("validate the data detail after failed create user")
    public void validateTheDataDetailAfterFailedCreateUser() {
        post.validateDataDetailFailed();
    }

    @Given("I set an endpoint for POST generate token")
    public void iSetAnEndpointForPOSTGenerateToken() {
        postGenerateToken.setEndpointForGenerate();
    }

    @When("I request POST generate token")
    public void iRequestPOSTGenerateToken() {
        postGenerateToken.requestPostGenerateToken();
    }
    @When("I request POST generate token with null username and password")
    public void iRequestPOSTGenerateTokenInvalid() {
        postGenerateToken.requestPostGenerateTokenInvalid();
    }
    @And("validate the data detail after generate token")
    public void validateTheDataDetailAfterGenerateToken() {
        postGenerateToken.validateDataDetailGenerateToken();
    }
    @And("validate the data detail after generate token failed")
    public void validateTheDataDetailAfterGenerateTokenFailed(){
        postGenerateToken.validateDataDetailTokenFailed();
    }

    @And("get token for other request")
    public void getTokenForOtherRequest() {
        this.token = postGenerateToken.getToken();
    }

    @Given("I set an endpoint for POST authorized user")
    public void iSetAnEndpointForPOSTAuthUser() {
        post.setPostEndpointAuth();
    }
    @When("I request POST detail user auth")
    public void iRequestPOSTDetailUserAuth() {
        post.requestPostDetailUserAuth();
    }
    @When("I request POST detail user auth with null email and password")
    public void iRequestPOSTDetailUserAuthWithNullEmailAndPassword(){
        post.requestPostDetailUserAuthWithNullEmailAndPassword();
    }
    @And("validate the data detail after authorized")
    public void validateTheDataDetailAfterAuthorized(){
        post.validateDataDetailAfterAuthorized();
    }
}