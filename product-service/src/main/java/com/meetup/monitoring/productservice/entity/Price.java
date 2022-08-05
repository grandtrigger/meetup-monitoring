package com.meetup.monitoring.productservice.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Price {
    private String id;
    private String productId;
    private BigDecimal value;
    private String name;
}

