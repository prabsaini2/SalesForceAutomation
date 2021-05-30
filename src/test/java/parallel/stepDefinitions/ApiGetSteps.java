package parallel.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import serviceObjects.ApiTester;

//public class ApiGetSteps {
//    ApiTester apiTester = new ApiTester();
//    int responseCode;
//    @Given("I send get request to subtract {string} from {string}")
//    public void i_send_get_request_to_subtract_from(String firstNumber, String secondNumber) {
//        responseCode = apiTester.getResponse(firstNumber,secondNumber).getStatusCode();
//    }
//
//    @Then("I get response code as {string}")
//    public void i_get_response_code_as(String statusCode) {
//        Assert.assertEquals(statusCode,Integer.toString(responseCode));
//
//    }
//}
