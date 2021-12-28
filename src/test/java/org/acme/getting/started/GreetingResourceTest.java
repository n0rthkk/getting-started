package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.getting.started.service.GreetingService;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Inject
    private GreetingService greetingService;

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

    @Test
    public void testHelloNameEndpoint() {
        final String name = UUID.randomUUID().toString();
        given()
                .when().get("/hello/" + name)
                .then()
                .statusCode(200)
                .body(is("Hello " + name + ", your id is 12345"));
    }

}