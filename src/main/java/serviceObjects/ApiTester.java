package serviceObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class ApiTester {
    Response response;
    RequestSpecification request= RestAssured.given().auth().none();

    public Response getResponse(int firstNumber, int secondNumber) {
       //return response = request.get("http://localhost:8282/api/substract/5/2");
        return response = request.get("http://localhost:8282/api/substract/{firstNumber}/{secondNumber}",firstNumber,secondNumber);
    }

    public Response postResponse() {
        String body = "{\n" +
                "\"method\": \"division\",\n" +
                "\"firstNumber\":10,\n" +
                "\"secondNumber\":6\n" +
                "}";
        return response = request.log().all().body(body).post("http://localhost:8282/api/calculator");

    }
    public Response getAddResponse() {
        return response = request.log().all().get("http://localhost:8282/api/add/5/2");


    }

//    @Test
//    public void testGetCall(){
//        int get = getResponse().getStatusCode();
//        assert get==200;
//          Response response = getResponse();
//          String getResult =  response.body().print();
//          System.out.println (response.getStatusCode());
//          System.out.println (response.statusLine());
//        System.out.println (response.getTime());

   //}
    @Test
    public void testPostCall(){
        int post = postResponse().getStatusCode();
        assert post==200;
    }
//    @Test
//    public void testGetAddCall() {
//        int get = getAddResponse().getStatusCode();
//        assert get == 200;
//        response = getResponse();
//        String getResult =  response.body().prettyPrint();
//         System.out.println(getResult);
//        //String getResult =
//    }


}


