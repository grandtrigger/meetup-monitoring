package com.meetup.monitoring.productservice.service;

import com.meetup.monitoring.productservice.entity.Product;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductCompositionService {

  public List<Product> getProducts() {
    return List.of(
        Product.builder().id("33b2e396-124e-43e3-b9f3-36347d0ca525")
            .active(Boolean.TRUE).name("Caixa de papelão")
            .publishedAt(LocalDateTime.parse("2022-06-01T00:00:00")).build(),
        Product.builder().id("64529cb5-9c51-4355-a8a8-7d33caa07bda")
            .active(Boolean.TRUE).name("Caixa de plástico")
            .publishedAt(LocalDateTime.parse("2022-07-26T22:27:00")).build());
  }
}
