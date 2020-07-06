package channel;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import lib.Base;
import org.testng.annotations.Test;

import java.io.File;

public class CreateChannel extends Base {

    final File file = new File("createChannelData.json");

    @Test
    public void createChannelForFB() {
        ExtractableResponse response = RestAssured
                .given()
                .body(file)
                .post("channels")
        .then()
        .assertThat()
                .statusCode(201)
                .extract();
        clientId = response.jsonPath().get("id");
    }
}
