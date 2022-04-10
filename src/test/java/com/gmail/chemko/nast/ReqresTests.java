package com.gmail.chemko.nast;

import com.gmail.chemko.nast.models.User;
import com.gmail.chemko.nast.models.LombokUserData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static com.gmail.chemko.nast.spec.Specs.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReqresTests {

    @Test
    void successfulRegister() {

        User user = new User();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("pistol");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/register")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getId(), user.getId());
        assertEquals(user.getToken(), "QpwL5tke4Pnpja7X4");
    }

    @Test
    void successfulLogin() {
        User user = new User();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("cityslicka");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/login")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getToken(), "QpwL5tke4Pnpja7X4");
    }

    @Test
    void unsuccessfulLogin() {
        User user = new User();
        user.setEmail("peter@klaven");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/login")
                .then()
                .statusCode(400)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getError(), "Missing password");
    }

    @Test
    void createUser() {
        User user = new User();
        user.setName("morpheus");
        user.setJob("leader");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().body()
                .extract().as(User.class);
        assertEquals(response.getName(), "morpheus");
        assertEquals(response.getJob(), "leader");
    }

    @Test
    void updateUser() {
        User user = new User();
        user.setName("morpheus");
        user.setJob("zion resident");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .put("/users/2")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);
        assertEquals(response.getName(), "morpheus");
        assertEquals(response.getJob(), "zion resident");
    }

    @Test
    void singleUser() {

        User response = given()
                .when()
                .get("/users/2")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals(response.getId(), "2");
        assertEquals(response.getEmail(), "janet.weaver@reqres.in");
    }

    @Test
    void singleUserNotFound() {

        Response response = given()
                .when()
                .get("/users/23")
                .then()
                .statusCode(404)
                .log().body()
                .extract().response();
        assertThat(response).isNotNull();
    }
}