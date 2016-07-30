package com.restbucks.beverage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restbucks.domain.model.Beverage;

@Service
public class BeverageServiceImpl implements BeverageService {

  // @Autowired
  private BeverageRepository beverageRepository;

  @Autowired
  public BeverageServiceImpl(BeverageRepository beverageRepository) {
    this.beverageRepository = beverageRepository;
  }

  @Override
  public List<Beverage> getBeverages() {
    return beverageRepository.findAll();
  }

}
