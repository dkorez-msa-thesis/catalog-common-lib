package dev.dkorez.msathesis.catalog.mapper;

import dev.dkorez.msathesis.catalog.dto.ProductDto;
import dev.dkorez.msathesis.catalog.entity.ProductDao;

import java.util.Collections;

public class ProductMapper {
    public static ProductDto toDto(ProductDao entity) {
        if (entity == null)
            return null;

        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        dto.setQuantity(entity.getQuantity());
        dto.setActive(entity.isActive());
        dto.setCategory(entity.getCategory() != null ?
                CategoryMapper.toDto(entity.getCategory()) : null);
        dto.setBrand(entity.getBrand() != null ?
                BrandMapper.toDto(entity.getBrand()) : null);
        dto.setSpecs(entity.getSpecification() != null ?
                entity.getSpecification().stream().map(SpecificationMapper::toDto).toList() : Collections.emptyList());
        dto.setTags(entity.getTags() != null ?
                entity.getTags().stream().map(TagMapper::toDto).toList() : Collections.emptyList());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());

        return dto;
    }

    public static ProductDao fromDto(ProductDto dto) {
        if (dto == null)
            return null;

        ProductDao entity = new ProductDao();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setQuantity(dto.getQuantity());
        entity.setActive(dto.isActive());
        entity.setCategory(dto.getCategory() != null ?
                CategoryMapper.fromDto(dto.getCategory()) : null);
        entity.setBrand(dto.getBrand() != null ?
                BrandMapper.fromDto(dto.getBrand()) : null);

        return entity;
    }
}
