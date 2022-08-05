package com.meetup.monitoring.productorchestratorservice.controller;

import com.meetup.monitoring.productorchestratorservice.usecase.GetProductsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {

  private GetProductsUseCase getProductsUseCase;

  @GetMapping
  public ResponseEntity<?> getProducts() {
    return new ResponseEntity<>(getProductsUseCase.getProducts(), HttpStatus.OK);
  }
}
