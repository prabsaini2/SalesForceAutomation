package serviceObjects;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class PublicApiTester {
    @Test
    public void test_01(){
        Response response  = get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.statusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("Content-type"));
        System.out.println(response.getTime());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void test_02(){
        given()

                .get("https://reqres.in/api/users?page=2")
        .then()
                .statusCode(200).body("data.id[0]",equalTo(7)).log().all().
        body("data.first_name",hasItems("Michael","Lindsay"));
    }
    @Test
    public void test_03_post(){
//    Map<String, Object> map = new HashMap<String, Object>();
//    map.put("name", "Raghav");
//    map.put("job", "Teacher");
    //Import some Json library (json-simple in pom) so that it comes out in proper jason format.
        JSONObject request = new JSONObject();//also removed map from this ()
        //once the JSON library is imported we can add info without using map shown below
        request.put("name", "Raghav");
        request.put("job", "Teacher");
        System.out.println(request);//this will also give json and below one also.
        System.out.println(request.toJSONString());
        given().
                header("Content-Type","application/json").//this is one way of header
                contentType(ContentType.JSON). //this is second adn it also accepts the content
                accept(ContentType.JSON).
                body(request.toJSONString()).//only request will also work but toJsonstring is to make sure
        when().
                post("https://reqres.in/api/users").
        then().
        statusCode(201);

    }
    @Test
    public void test_04_put(){

        JSONObject request = new JSONObject();
        request.put("name", "Raghav");
        request.put("job", "Teacher");
        System.out.println(request);
        System.out.println(request.toJSONString());
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                put("https://reqres.in/api/users/2").
        then().
                statusCode(200);
        //patch is also for update something like put code is again 200


    }
    @Test
    public void test_05_delete(){

         when().
                delete("https://reqres.in/api/users/2").
         then().
                statusCode(200);


    }

}
