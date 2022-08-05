package com.meetup.monitoring.priceservice.service;

import com.meetup.monitoring.priceservice.entity.Price;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PriceCompositionService {

  public List<Price> getPrices() {
    return List.of(
        Price.builder().id("7095e39c-bced-45bb-ade8-fe7bddd119bc")
            .productId("33b2e396-124e-43e3-b9f3-36347d0ca525").name("Caixa de papelão")
            .value(new BigDecimal("1.99")).build(),
        Price.builder().id("d0c2b06e-eba4-474d-a2c2-a678f1511144")
            .productId("64529cb5-9c51-4355-a8a8-7d33caa07bda").name("Caixa de plástico")
            .value(new BigDecimal("3.99")).build());
  }
}
