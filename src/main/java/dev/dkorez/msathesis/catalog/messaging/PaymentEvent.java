package dev.dkorez.msathesis.catalog.messaging;

import dev.dkorez.msathesis.catalog.model.PaymentDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentEvent {
    PaymentEventType type;
    Long paymentId;
    PaymentDto payment;
}
