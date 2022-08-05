package com.meetup.monitoring.productservice.controller;

import com.meetup.monitoring.productservice.entity.Product;
import com.meetup.monitoring.productservice.usecase.GetProductByIdUseCase;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {
  private final GetProductByIdUseCase getProductByIdUseCase;

  @GetMapping("/{id}")
  private ResponseEntity<Product> getProductById(@PathVariable("id") String id) {
    return new ResponseEntity<>(getProductByIdUseCase.getPriceByProductId(id), HttpStatus.OK);
  }

  @GetMapping
  private ResponseEntity<List<Product>> getProductById() {
    return new ResponseEntity<>(getProductByIdUseCase.getProducts(), HttpStatus.OK);
  }
}
