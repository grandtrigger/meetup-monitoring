package com.meetup.monitoring.productorchestratorservice.client;

import com.meetup.monitoring.productorchestratorservice.entity.ProductResponse;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "productClient", url = "${external.clients.product}")
public interface ProductClient {
  @GetMapping(value = "products")
  List<ProductResponse> getProducts();
}
