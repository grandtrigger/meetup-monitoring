package com.meetup.monitoring.productorchestratorservice.entity;

import java.time.LocalDateTime;
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
public class ProductResponse {
  private String id;
  private String name;
  private LocalDateTime publishedAt;
  private boolean active;
}
