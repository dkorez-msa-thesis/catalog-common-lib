package dev.dkorez.msathesis.catalog.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    Long productId;
    int quantity;
    BigDecimal price;
}
