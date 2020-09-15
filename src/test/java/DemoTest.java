import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void practiceTest(){
        String url = "https://reqres.in/api/users/2";

        Response response = RestAssured.given().get(url).andReturn();
        response.getBody().prettyPrint();

        RestAssured.get();
        RestAssured.post();
        RestAssured.delete();
        RestAssured.put();


        /* 3 Sections of Request
        1) Request line  GET url
        2) Header
        3) Body     */

        // Status Line
        response.getBody();

        // Header
        response.getStatusCode();
        response.getHeaders();
        response.getHeader("Content-Type");

        // Body
        response.getBody();
    }
    @Test
    public void practiceTest2(){
        String url = "https://swapi.dev/api/people/3/";
        Response response = RestAssured.given().get(url).andReturn();
        response.getBody().prettyPrint();
    }




}
