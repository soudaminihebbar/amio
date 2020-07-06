package channel;

import io.restassured.RestAssured;
import lib.Base;
import org.testng.annotations.Test;

public class DeleteChannel extends Base {

    @Test
    public void deleteChannel() {
        RestAssured
                .given()
                .delete("channels/"+ clientId)
                .then()
                .assertThat().statusCode(204);
    }
}
