package com.restbucks.beverage;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.restbucks.beverage.BeverageServiceImpl;
import com.restbucks.builder.BeverageBuilder;
import com.restbucks.domain.model.Beverage;

@RunWith(MockitoJUnitRunner.class)
public class BeverageServiceImplTest {

  @InjectMocks
  private BeverageServiceImpl beverageService;

  @Mock
  private BeverageRepository beverageRepository;

  @Test
  public void whenRetrievingAllBeverages_ShouldReturnGrandePikeRoast() throws Exception {
    String expected = "Grande Pike Roast";
    Mockito.when(beverageRepository.findAll()).thenReturn(
        Arrays.asList(BeverageBuilder.aBeverage().withName("Grande Pike Roast").build()));

    List<Beverage> beverages = beverageService.getBeverages();

    assertThat(beverages).filteredOn(beverage -> beverage.getName().contains(expected));
  }
}
