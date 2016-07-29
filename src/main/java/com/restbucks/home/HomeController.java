package com.restbucks.home;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/home"})
public class HomeController {

  @RequestMapping(value = "/", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> retrieveWelcomeMessage() {
    return new ResponseEntity<>("Welcome to Restbucks, Spring Boot Style!", HttpStatus.OK);
  }

}
