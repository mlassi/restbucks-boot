package com.restbucks.beverage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.restbucks.beverage.BeverageController;
import com.restbucks.builder.BeverageBuilder;
import com.restbucks.domain.model.Beverage;

@RunWith(MockitoJUnitRunner.class)
public class BeverageControllerTest {

  @InjectMocks
  private BeverageController ctrl;

  @Mock
  private BeverageService service;

  @Test
  public void whenReterievingAllBeverages_ShouldReturnAtLeastTwoBeverages() throws Exception {
    when(service.getBeverages())
        .thenReturn(Arrays.asList(BeverageBuilder.aBeverage().withName("one").build(),
            BeverageBuilder.aBeverage().withName("two").build()));
    
    ResponseEntity<List<Beverage>> beverages = ctrl.retrieveAllBeverages();
    
    assertThat(beverages.getBody().size()).isGreaterThanOrEqualTo(2);
  }
}
