package Starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {

    private static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint(){
        return base_url + "User";
    }

    @Step("I set an endpoint for POST authorized user")
    public String setPostEndpointAuth(){
        return base_url + "Authorized";
    }

    @Step("I request POST detail user")
    public void requestPostDetailUser(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "ghinaauliannisa1");
        requestData.put("password", "Lupakali22!");

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }
    @Step("I request POST detail user authorize")
    public void requestPostDetailUserAuth(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "ghinaauliannisa1");
        requestData.put("password", "Lupakali22!");

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpointAuth());
    }
    @Step("I request POST detail user auth with null email and password")
    public void requestPostDetailUserAuthWithNullEmailAndPassword(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "");
        requestData.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("validate the data detail after create user")
    public void validateDataDetail(){
        SerenityRest.then().body("username", equalTo("ghinaauliannisa1"));
    }

    @Step("Get userId from the response")
    public String getUserId(){
        Response response = SerenityRest.lastResponse();
        String userId = response.body().path("userID");
        System.out.println(userId);
        return userId;
    }

    @Step("I request POST detail user with invalid password")
    public void requestPostInvalid(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "ghinaauliannisa1");
        requestData.put("password", "123345");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed create user")
    public void validateDataDetailFailed(){
        then().body("code", equalTo("1300"));
    }

    @Step("validate the data detail after authorized")
    public void validateDataDetailAfterAuthorized() { then().body("code", equalTo("1200"));}

}
