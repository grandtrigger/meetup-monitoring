package com.meetup.monitoring.priceservice.controller;

import com.meetup.monitoring.priceservice.entity.Price;
import com.meetup.monitoring.priceservice.usecase.GetPriceByProductIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prices")
@AllArgsConstructor
@ControllerAdvice
public class PriceController {
  private final GetPriceByProductIdUseCase getPriceByProductIdUseCase;

  @GetMapping("/{productId}")
  public ResponseEntity<Price> getPriceByProductId(@PathVariable("productId") String productId) {
    return new ResponseEntity<>(getPriceByProductIdUseCase.getPriceByProductId(productId), HttpStatus.OK);
  }
}
