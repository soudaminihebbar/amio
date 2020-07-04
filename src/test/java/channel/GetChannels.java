package channel;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetChannels {

    @Test
    public void getAllChannels() {
        RestAssured.baseURI = "https://api.amio.io/v1/channels";
        RestAssured.authentication = RestAssured.oauth2("dHLupPB3GrpEFMeuYYKXyzdEC7om8PnJfTex9brAgo7s18G04LZxuX6tQxB6mcIMHh5ONNAtAHOLCi7a9JBFqmazHI");
        RestAssured
                .given()
                .log().all()
                .get()
                .then()
                .log().all();
    }
}
