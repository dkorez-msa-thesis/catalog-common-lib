package dev.dkorez.msathesis.catalog.mapper;

import dev.dkorez.msathesis.catalog.dto.SpecificationDto;
import dev.dkorez.msathesis.catalog.entity.SpecificationDao;

public class SpecificationMapper {
    public static SpecificationDto toDto(SpecificationDao entity) {
        if (entity == null)
            return null;

        SpecificationDto dto = new SpecificationDto();
        dto.setName(entity.getName());
        dto.setValue(entity.getValue());

        return dto;
    }

    public static SpecificationDao fromDto(SpecificationDto dto) {
        if (dto == null)
            return null;

        SpecificationDao entity = new SpecificationDao();
        entity.setName(dto.getName());
        entity.setValue(dto.getValue());

        return entity;
    }
}
