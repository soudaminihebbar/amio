package channel;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class CreateChannel {

    File file = new File("createChannelData.json");
    @Test
    public void createChannelForFB() {
        RestAssured.baseURI = "https://api.amio.io/v1/channels";
        RestAssured.authentication = RestAssured.oauth2("dHLupPB3GrpEFMeuYYKXyzdEC7om8PnJfTex9brAgo7s18G04LZxuX6tQxB6mcIMHh5ONNAtAHOLCi7a9JBFqmazHI");

        RestAssured
                .given()
                .body(file)
                .post()
        .then()
        .assertThat().statusCode(201);
    }
}
