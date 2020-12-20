import Pages.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class ApiTest extends BaseTest {


    @Test
    public void checkStatusCode() {
        Response response = requestSpecification
                .basePath("/v2/user/user1")
                .get();
        Assert.assertEquals(200, response.statusCode());
    }

    @Test
    public void checkUserNotFound() {
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/user/user8877")
                .get();
        User body = response.getBody().as(User.class);
        Assert.assertEquals(body.getMessage(), "User not found");
    }

    @Test
    public void checkId() {
        Response response = requestSpecification
                .basePath("/v2/user/user1")
                .get();
        response.getBody().as(User.class);


    }
}
