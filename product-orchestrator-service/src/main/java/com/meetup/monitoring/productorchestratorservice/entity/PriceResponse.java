package com.meetup.monitoring.productorchestratorservice.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceResponse {
  private String id;
  private String productId;
  private BigDecimal value;
  private String name;
}
