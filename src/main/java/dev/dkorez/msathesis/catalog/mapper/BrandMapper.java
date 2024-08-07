package dev.dkorez.msathesis.catalog.mapper;

import dev.dkorez.msathesis.catalog.dto.BrandDto;
import dev.dkorez.msathesis.catalog.entity.BrandDao;

public class BrandMapper {
    public static BrandDto toDto(BrandDao entity) {
        if (entity == null)
            return null;

        BrandDto dto = new BrandDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());

        return dto;
    }

    public static BrandDao fromDto(BrandDto dto) {
        if (dto == null)
            return null;

        BrandDao entity = new BrandDao();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());

        return entity;
    }
}
