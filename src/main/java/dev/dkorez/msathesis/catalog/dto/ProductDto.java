package dev.dkorez.msathesis.catalog.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProductDto {
    Long id;
    String name;
    String description;
    BigDecimal price;
    int quantity;
    boolean active;
    CategoryDto category;
    BrandDto brand;
    List<SpecificationDto> specs;
    List<TagDto> tags;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
