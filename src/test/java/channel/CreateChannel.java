package channel;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class CreateChannel extends Base{

    final File file = new File("createChannelData.json");

    @Test
    public void createChannelForFB() {
        RestAssured
                .given()
                .body(file)
                .post()
        .then()
        .assertThat().statusCode(201);
    }
}
