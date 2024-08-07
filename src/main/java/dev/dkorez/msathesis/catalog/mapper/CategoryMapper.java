package dev.dkorez.msathesis.catalog.mapper;

import dev.dkorez.msathesis.catalog.dto.CategoryDto;
import dev.dkorez.msathesis.catalog.entity.CategoryDao;

public class CategoryMapper {
    public static CategoryDto toDto(CategoryDao entity) {
        if (entity == null)
            return null;

        CategoryDto dto = new CategoryDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());

        return dto;
    }

    public static CategoryDao fromDto(CategoryDto dto) {
        if (dto == null)
            return null;

        CategoryDao entity = new CategoryDao();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());

        return entity;
    }
}
