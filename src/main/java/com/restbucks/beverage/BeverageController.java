package com.restbucks.beverage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restbucks.domain.model.Beverage;

@RestController
@RequestMapping({"/api/beverage"})
public class BeverageController {

  BeverageService beverageService;

  @Autowired
  public BeverageController(BeverageService beverageService) {
    this.beverageService = beverageService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Beverage>> retrieveAllBeverages() {
    return new ResponseEntity<>(beverageService.getBeverages(), HttpStatus.OK);
  }

}
