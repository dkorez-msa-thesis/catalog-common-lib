package dev.dkorez.msathesis.catalog.messaging;

import lombok.Data;

@Data
public class InventoryEvent {
    private InventoryEventType type;
    private Long productId;
    private Integer quantity;
    private Long orderId;
}
