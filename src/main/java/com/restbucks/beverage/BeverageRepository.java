package com.restbucks.beverage;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restbucks.domain.model.Beverage;

public interface BeverageRepository extends JpaRepository<Beverage, Long> {

}
