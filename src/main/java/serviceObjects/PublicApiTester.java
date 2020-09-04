package serviceObjects;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.junit.Assert;



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
                .statusCode(200);
    }

}
