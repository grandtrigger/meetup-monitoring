package com.meetup.monitoring.productservice.usecase;

import com.meetup.monitoring.productservice.crosscutting.exception.BusinessException;
import com.meetup.monitoring.productservice.entity.Price;
import com.meetup.monitoring.productservice.entity.Product;
import com.meetup.monitoring.productservice.service.ProductCompositionService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetProductByIdUseCase {
  private final ProductCompositionService productCompositionService;

  @SneakyThrows
  public Product getPriceByProductId(String productId) {
    List<Product> products = productCompositionService.getProducts().stream()
        .filter(product -> productId.equals(product.getId())).toList();

    return products.stream().findFirst().orElseThrow(() -> new BusinessException("Product not found"));

  }

  public List<Product> getProducts() {
    return productCompositionService.getProducts();
  }
}
