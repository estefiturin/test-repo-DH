package TestBack;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class POSTTest {

    @Test
    public void Post_Test01() {
        JsonObject request = new JsonObject();

        request.addProperty("Job", "Teacher");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toString()).
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201).log().all();


    }
}
