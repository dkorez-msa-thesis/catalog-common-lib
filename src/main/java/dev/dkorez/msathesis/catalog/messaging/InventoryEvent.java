package dev.dkorez.msathesis.catalog.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InventoryEvent {
    private InventoryEventType type;
    private Long productId;
    private Integer quantity;
    private Long orderId;
}
