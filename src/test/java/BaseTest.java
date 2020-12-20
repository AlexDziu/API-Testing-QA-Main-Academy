import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class BaseTest {


    protected RequestSpecification requestSpecification;

    private void getRequestSpecification() {
        this.requestSpecification = RestAssured.given().baseUri("https://petstore.swagger.io");
    }

    @Before
    public void before() {
        getRequestSpecification();
    }

}
