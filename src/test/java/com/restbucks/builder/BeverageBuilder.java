package com.restbucks.builder;

import com.restbucks.domain.model.Beverage;

public class BeverageBuilder {
  private Beverage beverage = new Beverage();

  public static BeverageBuilder aBeverage() {
    return new BeverageBuilder();
  }

  public BeverageBuilder withId(Long id) {
    beverage.setId(id);
    return this;
  }

  public BeverageBuilder withName(String name) {
    beverage.setName(name);
    return this;
  }

  public BeverageBuilder withDescription(String description) {
    beverage.setDescription(description);
    return this;
  }

  public Beverage build() {
    return beverage;
  }
}
