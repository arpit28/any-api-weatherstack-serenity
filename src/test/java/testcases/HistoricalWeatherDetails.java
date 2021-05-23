package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.WeatherStackApiSteps;

@RunWith(SerenityRunner.class)
public class HistoricalWeatherDetails extends Basetest{

    @Steps
    WeatherStackApiSteps api;

    @Title("Getting the historical weather data for Dublin")
    @Test
    public void historicalDataRequestForCity() {
        api.sendGetRequestForCityForHistoricalData("Dublin", "2021-05-10", "2021-05-16");
        api.validateStatusCodeToBe(200);
        api.verifyResponseBody("error.info", "Your current subscription plan does not support historical weather data. Please upgrade your account to use this feature.");
    }
}
