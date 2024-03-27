package TestBack;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PUTTest {

    @Test
    public void Post_Test01() {
        JsonObject request = new JsonObject();

        request.addProperty("name", "Estefania");
        request.addProperty("Job", "Tester");

        given().
                header("Content-type", "application/json").
                contentType(ContentType.JSON).
                body(request.toString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();

    }
}
