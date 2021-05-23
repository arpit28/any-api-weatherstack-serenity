package steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

public class WeatherStackApiSteps {

    private Response response;
    String access_key = "7bc4ba124a03cd6ce4ab7818624d4ecf";

    @Step("When I get request for weather update for city: {0}")
    public void sendGetRequestForCityForWeatherUpdate(String city) {

        response =
                SerenityRest.given()
                        .param("access_key", access_key)
                        .param("query", city)
                        .when()
                        .get("/current");

        response.prettyPrint();
    }

    @Step("When I send get request for historical weather data for city: {0}, from date {1} and end date {2}")
    public void sendGetRequestForCityForHistoricalData(String city, String startDate, String endDate) {

        response =
                SerenityRest.given()
                        .param("access_key", access_key)
                        .param("query", city)
                        .param("historical_date_start", startDate)
                        .param("historical_date_end", endDate)
                        .when()
                        .get("/historical");

        response.prettyPrint();

    }

    @Step("Then I validate status code to be {0}")
    public void validateStatusCodeToBe(int code) {

        response.then().statusCode(code);
    }

    @Step("And I verify response body for key {0} and value {1}")
    public void verifyResponseBody(String key, String value) {

        response.then().body(key,Matchers.equalTo(value));
    }
}
