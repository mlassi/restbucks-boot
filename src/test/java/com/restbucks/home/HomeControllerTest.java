package com.restbucks.home;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HomeControllerTest {

  @Test
  public void whenRetrievingWelcomeMessage_ShouldReturnWelcomeMessage() throws Exception {
    String expected = "Welcome to Restbucks, Spring Boot Style!";
    HomeController ctrl = new HomeController();

    String actual = ctrl.retrieveWelcomeMessage().getBody();

    Assertions.assertThat(actual).isEqualTo(expected);

  }
}
