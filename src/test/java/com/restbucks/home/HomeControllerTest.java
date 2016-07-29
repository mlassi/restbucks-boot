package com.restbucks.home;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HomeControllerTest {

  @Test
  public void whenRetrievingWelcomeMessage_ShouldReturnWelcomeMessage() throws Exception {
    String expected = "Welcome to Restbucks, Spring Boot Style!";
    HomeController ctrl = new HomeController();

    String actual = ctrl.retrieveWelcomeMessage().getBody();

    assertThat(actual).isEqualTo(expected);

  }
}
