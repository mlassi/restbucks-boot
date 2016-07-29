package com.restbucks.home;

import static io.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.restbucks.RestbucksBootApplication;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestbucksBootApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class HomeControllerAPITest {

  @Value("${local.server.port}")
  private int port;

  @Before
  public void setUp() {
    RestAssured.baseURI = "http://localhost:" + port;
    RestAssured.basePath = "/api/home/";
  }

  @Test
  public void whenRetrievingWelcomeMessage_ShouldReturnWelcomeMessage() throws Exception {
    String expected = "Welcome to Restbucks, Spring Boot Style!";

    given().when().get().then().statusCode(200).and().extract().asString().equals(expected);
  }

}
