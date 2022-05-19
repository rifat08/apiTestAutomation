package comTest.BracIntApi;

import comTest.BaseApiTest;
import comTest.pojo.StoreLoanCollectionInfoData;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class StoreLoanCollection extends BaseApiTest {
    @Override
    public String getController() {
        return "scapi";
    }


    @Test
    public void MemberListTest() {

        given()
                .spec(getHeadersTz())
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/memberList?countryCode=834&officeCode=TZ500135")
                .then()
                .log().body()
                .statusCode(200);
            //   .body("data[0].groupCode", equalTo("TZ500135-00001"));

    }

    @Test
    public void storeLoanCollectionInfo() {
//        String json = "{\n" +
//                "  \"utilityref\": \"031476\",\n" +
//                "  \"msisdn\": \"031476\",\n" +
//                "  \"amount\": \"2343400\",\n" +
//                "  \"transid\": \"031476\",\n" +
//                "  \"reference\": \"031476\",\n" +
//                "  \"operator\": \"TEST\"\n" +
//                "}";

        StoreLoanCollectionInfoData storeLoanCollectionInfoData = new StoreLoanCollectionInfoData("031477", "0140076", "100",
                "034776", "031006", "TEST");

        given()
                .spec(getHeadersTz())
                .accept(ContentType.JSON)
                .queryParam("data", storeLoanCollectionInfoData)
                .body(storeLoanCollectionInfoData)
                .log().uri()
                .when()
                .post("/storeLoanCollectionInfo")
                .then()
                .statusCode(200)
                .log().body();
        Assert.assertTrue(storeLoanCollectionInfoData.getUtilityref().contains("031477"));


    }


}
