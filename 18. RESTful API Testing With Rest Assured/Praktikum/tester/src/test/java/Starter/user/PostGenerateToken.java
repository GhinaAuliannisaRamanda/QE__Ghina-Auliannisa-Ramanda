package Starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class PostGenerateToken {
       private static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST generate token")
    public String setEndpointForGenerate(){
        return base_url + "GenerateToken";
    }

    @Step("I request POST generate token")
    public void requestPostGenerateToken() {
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "ghinaauliannisa1");
        requestData.put("password", "Lupakali22!");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndpointForGenerate());
    }

    @Step("validate the data detail after generate token")
    public void validateDataDetailGenerateToken(){
        then().body("result", equalTo("User authorized successfully."));
    }
    @Step("I request POST generate token with null username and password")
    public void requestPostGenerateTokenInvalid(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "");
        requestData.put("password", "");
        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndpointForGenerate());
    }
    @Step("validate the data detail after generate token failed")
    public void validateDataDetailTokenFailed(){
        then().body("result", equalTo(null)); }
    @Step("get token for other request")
    public String getToken(){
        Response response = SerenityRest.lastResponse();
        String token = response.body().path("token");
        System.out.println(token);
        return token;
    }
}
