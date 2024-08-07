package dev.dkorez.msathesis.catalog.mapper;

import dev.dkorez.msathesis.catalog.dto.TagDto;
import dev.dkorez.msathesis.catalog.entity.TagDao;

public class TagMapper {
    public static TagDto toDto(TagDao entity) {
        if (entity == null)
            return null;

        TagDto dto = new TagDto();
        dto.setName(entity.getName());

        return dto;
    }

    public static TagDao fromDto(TagDto dto) {
        if (dto == null)
            return null;

        TagDao entity = new TagDao();
        entity.setName(dto.getName());

        return entity;
    }
}
