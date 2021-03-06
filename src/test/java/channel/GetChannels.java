package channel;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import lib.Base;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItem;

public class GetChannels extends Base {

    @Test
    public void getAllChannels() {
        ValidatableResponse response = RestAssured
                .given()
                .get("channels")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void getAllChannelsAndVerify() {
        ValidatableResponse response = RestAssured
                .given()
                .get("channels")
                .then()
                .assertThat()
                .statusCode(200)
                .body("id", hasItem(clientId));
    }
}
