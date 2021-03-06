package message;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import lib.Base;
import org.testng.annotations.Test;

import java.io.File;

public class CreateMessage extends Base {
    File file = new File("message.json");
    File filemessage = new File("fileMessage.json");

    @Test
    public void createTextMessage() {

        ExtractableResponse response = RestAssured
                .given()
                .body(file)
                .post("messages")
                .then()
                .assertThat()
                .statusCode(201)
                .extract();
        textId = response.jsonPath().get("id");
    }

    @Test
    public void createFileMessage() {

        ExtractableResponse response = RestAssured
                .given()
                .body(filemessage)
                .post("messages")
                .then()
                .assertThat()
                .statusCode(201)
                .extract();
        fileId = response.jsonPath().get("id");

    }
}
