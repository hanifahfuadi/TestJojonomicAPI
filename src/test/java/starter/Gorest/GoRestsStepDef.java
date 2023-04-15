package starter.Gorest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class GoRestsStepDef {

    @Steps
    JojonomicAPI gorestAPI;

//skenario 1

    @Given("Set Paramater Current Weather")
    public void setParamaterCurrentWeather() {
        SerenityRest.when().get(JojonomicAPI.GET_LIST_CURRENT);
    }

    @Then("API should return response {int} OK")
    public void apiShouldReturnResponseOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }


    @And("Validate Current Weather json schema")
    public void validateCurrentWeatherJsonSchema() {
        File json = new File(JojonomicAPI.JSON_SCHEMA + "/GetCurrent.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    // skenario 2
    @Given("Set Paramater Forecast Weather")
    public void setParamaterForecastWeather() {
        SerenityRest.when().get(JojonomicAPI.GET_LIST_FORERCAST);
    }

    @Then("API should return response {int} Forbidden")
    public void apiShouldReturnResponseForbidden(int Forbidden) {
        SerenityRest.then().statusCode(Forbidden);
    }

    @And("Validate Get ToDos json schema")
    public void validateGetToDosJsonSchema() {
        File json = new File(JojonomicAPI.JSON_SCHEMA + "/GetForecast.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
