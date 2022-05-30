package comTest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public abstract class BaseApiTest {

    protected abstract String getController();

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = "https://erpstaging.brac.net/node/";
    //   RestAssured.baseURI = "http://34.87.126.240:9090";
//        RestAssured.port = 443;
        RestAssured.basePath = "/" + getController();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    protected RequestSpecification getHeadersTz() {
        return new RequestSpecBuilder()
                .addHeader("Authorization", "ewallet")
                .setRelaxedHTTPSValidation()
                .build();
    }
}
