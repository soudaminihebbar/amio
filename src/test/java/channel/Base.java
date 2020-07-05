package channel;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class Base {

    public static String cliendId;

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = "https://api.amio.io/v1/channels";
        RestAssured.authentication = RestAssured.oauth2("dHLupPB3GrpEFMeuYYKXyzdEC7om8PnJfTex9brAgo7s18G04LZxuX6tQxB6mcIMHh5ONNAtAHOLCi7a9JBFqmazHI");
    }
}
