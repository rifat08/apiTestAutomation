package comTest.HoFinApi;

import comTest.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class HoFinApiLiveTest extends BaseApiTest {

    @Override
    protected String getController() {
        return "hfapir";
    }

    @Test
    public void BankAccountListTest() {

        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=bankAccountList&interval=100")
                .then()
                .log().body()
                .statusCode(200)
               .body("data[0].bankAccountId", equalTo("BBA0003838"));

    }

    @Test
    public void BankBranchList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=bankBranchList&interval=100")
                .then()
                .log().body()
                .statusCode(200)
              .body("data[0].branchCode", equalTo("Pura"));
    }

    @Test
    public void projectCoAMappingList(){
    given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=projectCoAMappingList&interval=13")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void currencyDenominationSetupList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=currencyDenominationSetupList&interval=10000")
                .then()
                .log().body()
                .statusCode(200)
         .body("data[0].denomination_name",equalTo("1"));
    }

    @Test
    public void areaCurrentAccountCodeList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=areaCurrentAccountCodeList&interval=5")
                .then()
                .log().body()
                .statusCode(200);
        // .body("data[0].bankId", equalTo(26));
    }

    @Test
    public void chartOfAccountsList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=chartOfAccountsList&interval=1000")
                .then()
                .log().body()
                .statusCode(200);
        // .body("data[0].bankId", equalTo(26));
    }
    @Test
    public void subCoaList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=subCoaList&interval=1000")
                .then()
                .log().body()
                .statusCode(200);
        // .body("data[0].bankId", equalTo(26));
    }
    @Test
    public void hoGliList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=hoGliList&interval=2")
                .then()
                .log().body()
                .statusCode(200);
        // .body("data[0].bankId", equalTo(26));
    }

    @Test
    public void bankList(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=bankList&interval=100000")
                .then()
                .log().body()
                .statusCode(200);
        // .body("data[0].bankId", equalTo(26));
    }

    @Test
    public void projectist(){
        given()
                //   .spec()
                .accept(ContentType.JSON)
                .log().uri()
                .when()
                .get("/getData?key=5d0a4a85-df7a-csiapi-bits-93eb-145f6a9902ae&apiName=bankList&interval=100000")
                .then()
                .log().body()
                .statusCode(200);
        // .body("data[0].bankId", equalTo(26));
    }

}
