package com.meetup.monitoring.productorchestratorservice.client;

import com.meetup.monitoring.productorchestratorservice.entity.PriceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "priceClient", url = "${external.clients.price}/prices")
public interface PriceClient {
  @GetMapping("/{productId}")
  PriceResponse getPrice(@PathVariable("productId") String productId);
}
