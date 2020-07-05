package channel;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class DeleteChannel extends Base{

    @Test
    public void deleteChannel() {
        RestAssured
                .given()
                .delete(cliendId)
                .then()
                .assertThat().statusCode(204);
    }
}
