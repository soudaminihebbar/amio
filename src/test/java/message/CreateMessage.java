package message;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class CreateMessage {
    File file = new File("message.json");

    @Test
    public void createMessage() {
        RestAssured.baseURI = "https://api.amio.io/v1/messages";
        RestAssured.authentication = RestAssured.oauth2("dHLupPB3GrpEFMeuYYKXyzdEC7om8PnJfTex9brAgo7s18G04LZxuX6tQxB6mcIMHh5ONNAtAHOLCi7a9JBFqmazHI");

        RestAssured
                .given()
                .body(file)
                .post()
                .then()
                .assertThat()
                .statusCode(201);
    }
}
