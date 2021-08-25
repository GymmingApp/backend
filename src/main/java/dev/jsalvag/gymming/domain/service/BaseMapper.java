package dev.jsalvag.gymming.domain.service;

import dev.jsalvag.gymming.domain.dto.BaseDTO;
import dev.jsalvag.gymming.persistence.entity.BaseEntity;

import java.util.List;
import java.util.stream.Collectors;

public interface BaseMapper<ENTITY extends BaseEntity, DTO extends BaseDTO> {
    ENTITY map(DTO dto);

    DTO map(ENTITY entity);

    default List<ENTITY> toEntities(List<DTO> dtos) {
        return dtos.parallelStream().map(this::map).collect(Collectors.toList());
    }

    default List<DTO> toDTOs(List<ENTITY> entities) {
        return entities.parallelStream().map(this::map).collect(Collectors.toList());
    }

}
