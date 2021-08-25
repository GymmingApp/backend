package dev.jsalvag.gymming.domain.service;

import dev.jsalvag.gymming.domain.dto.ExerciseDTO;
import dev.jsalvag.gymming.persistence.entity.Exercise;

import java.util.List;

public interface ExerciseService extends BaseMapper<Exercise, ExerciseDTO> {
    List<ExerciseDTO> list();
    ExerciseDTO get(Long id);
    ExerciseDTO create(ExerciseDTO dto);
}
