package com.restbucks.home;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.restbucks.RestbucksBootApplication;
import com.restbucks.domain.model.Beverage;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestbucksBootApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class BeverageControllerAPITest {

  @Value("${local.server.port}")
  private int port;

  @Before
  public void setUp() {
    RestAssured.baseURI = "http://localhost:" + port;
    RestAssured.basePath = "/api/beverage/";
  }

  @Test
  public void whenRetrievingBeverages_ShouldReturnAtLeastFiveBeverages() throws Exception {

    Beverage[] actual =
        RestAssured.given().when().get().then().statusCode(200).extract().as(Beverage[].class);
    Assertions.assertThat(actual.length).isGreaterThanOrEqualTo(5);
  }
}
