package com.meetup.monitoring.productorchestratorservice.usecase;

import com.meetup.monitoring.productorchestratorservice.client.PriceClient;
import com.meetup.monitoring.productorchestratorservice.client.ProductClient;
import com.meetup.monitoring.productorchestratorservice.entity.Price;
import com.meetup.monitoring.productorchestratorservice.entity.PriceResponse;
import com.meetup.monitoring.productorchestratorservice.entity.Product;
import com.meetup.monitoring.productorchestratorservice.entity.ProductResponse;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetProductsUseCase {
  public static Logger logger = LoggerFactory.getLogger(GetProductsUseCase.class);
  private PriceClient priceClient;
  private ProductClient productClient;

  public List<Product> getProducts() {
    List<Product> products = new ArrayList<>();
    List<ProductResponse> productsResponse = productClient.getProducts();

    productsResponse.forEach(productResponse -> {
      Product product = new Product();
      product.setId(productResponse.getId());
      product.setName(productResponse.getName());

      PriceResponse priceResponse = priceClient.getPrice(productResponse.getId());
      product.setPrice(new Price(priceResponse.getValue()));
      products.add(product);
    });

    logger.info(MessageFormat.format("Returning a list with {0} products", products.size()));
    return products;
  }
}
