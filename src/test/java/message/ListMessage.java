package message;

import io.restassured.RestAssured;
import lib.Base;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItems;

public class ListMessage extends Base {

    String viberBotChannelId = "6685593734598118153";
    String viberBotContactId = "6685599440411839514";

    @Test
    public void verifyMessage() {

        RestAssured
                .given()
                .log().all()
                .get("channels/"+viberBotChannelId+"/contacts/"+viberBotContactId+"/messages")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("id", hasItems(textId, fileId));

    }
}
