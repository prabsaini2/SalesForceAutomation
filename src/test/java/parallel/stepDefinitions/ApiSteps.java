package parallel.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import serviceObjects.ApiTester;

public class ApiSteps {
    ApiTester apiTester = new ApiTester();
    int responseCode;
    int postRespCode;

//    @Given("I send a get request to subtract {string} from {string}")
//    public void i_send_a_get_request_to_subtract_from(String firstNumber, String secondNumber) {
//        responseCode = apiTester.getResponse(firstNumber,secondNumber).getStatusCode();
//
//    }
//
//    @Then("I verify the response code is {string}")
//    public void i_verify_the_response_code_is(String statusCode) {
//        //Assert.assertEquals(statusCode,Integer.toString(responseCode));
//        //Assert.assertEquals("statusCode",responseCode);
//        Assert.assertEquals(statusCode,responseCode);

    @Given("I send a get request to subtract {int} from {int}")
    public void i_send_a_get_request_to_subtract_from(int int1, int int2) {
        responseCode = apiTester.getResponse(int1,int2).getStatusCode();

    }

    @Then("I verify the response code is {int}")
    public void i_verify_the_response_code_is(int statusCode) {
        Assert.assertEquals(statusCode,responseCode);

    }

    @Given("I send a post request")
    public void i_send_a_post_request() {

        postRespCode = apiTester.postResponse().getStatusCode();
    }

    @Then("I verify that the response code that comes back is {int}")
    public void i_verify_that_the_response_code_that_comes_back_is(int postStatusCode) {
        Assert.assertEquals(postStatusCode,postRespCode);

    }

    @Given("I send a get request to Add {int} to {int}")
    public void i_send_a_get_request_to_Add_to(int int1, int int2) {
      int responseCode = apiTester.getAddResponse(int1, int2).getStatusCode();
    }

    @Then("I verify that the response code is {int}")
    public void i_verify_that_the_response_code_is(int statusCode) {
        Assert.assertEquals(responseCode,statusCode);

    }


}




