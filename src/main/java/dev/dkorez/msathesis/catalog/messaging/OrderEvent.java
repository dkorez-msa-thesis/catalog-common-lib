package dev.dkorez.msathesis.catalog.messaging;

import dev.dkorez.msathesis.catalog.model.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderEvent {
    OrderEventType type;
    Long orderId;
    OrderDto order;
}
