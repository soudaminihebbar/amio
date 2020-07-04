package channel;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetChannels extends Base{

    @Test
    public void getAllChannels() {
        RestAssured
                .given()
                .get()
                .then()
                .assertThat().statusCode(200);
    }
}
