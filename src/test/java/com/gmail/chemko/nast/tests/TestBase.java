package com.gmail.chemko.nast.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static com.gmail.chemko.nast.helpers.CustomAllureListener.withCustomTemplates;

public class TestBase {

    @BeforeAll
    static void setUp() {
        RestAssured.filters(withCustomTemplates());
    }
}
