package dev.dkorez.msathesis.catalog.messaging;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.dkorez.msathesis.catalog.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductEvent {
    private ProductEventType type;
    private Long productId;
    private ProductDto product;
}