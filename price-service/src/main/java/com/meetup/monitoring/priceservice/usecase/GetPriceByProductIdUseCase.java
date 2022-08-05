package com.meetup.monitoring.priceservice.usecase;

import com.meetup.monitoring.priceservice.crosscutting.exception.BusinessException;
import com.meetup.monitoring.priceservice.entity.Price;
import com.meetup.monitoring.priceservice.service.PriceCompositionService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetPriceByProductIdUseCase {

  private final PriceCompositionService priceCompositionService;

  @SneakyThrows
  public Price getPriceByProductId(String productId) {
    List<Price> prices = priceCompositionService.getPrices().stream()
        .filter(price -> productId.equals(price.getProductId())).toList();

    return prices.stream().findFirst().orElseThrow(() -> new BusinessException("Price not found"));

  }
}
