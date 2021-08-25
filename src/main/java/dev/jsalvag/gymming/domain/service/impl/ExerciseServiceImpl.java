package dev.jsalvag.gymming.domain.service.impl;

import dev.jsalvag.gymming.domain.dto.ExerciseDTO;
import dev.jsalvag.gymming.domain.repository.ExerciseRepository;
import dev.jsalvag.gymming.domain.service.ExerciseService;
import dev.jsalvag.gymming.persistence.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public List<ExerciseDTO> list() {
        return this.toDTOs(exerciseRepository.findAll());
    }

    @Override
    public ExerciseDTO get(Long id) {
        return null;
    }

    @Override
    public ExerciseDTO create(ExerciseDTO dto) {
        return map(exerciseRepository.save(map(dto)));
    }

    @Override
    public Exercise map(ExerciseDTO dto) {
        final Exercise entity = new Exercise();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSeries(dto.getSeries());
        entity.setTimes(dto.getTimes());
        entity.setWight(dto.getWight());
        entity.setObservations(dto.getObservations());
        return entity;
    }

    @Override
    public ExerciseDTO map(Exercise entity) {
        final ExerciseDTO dto = new ExerciseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSeries(entity.getSeries());
        dto.setTimes(entity.getTimes());
        dto.setWight(entity.getWight());
        dto.setObservations(entity.getObservations());
        return dto;
    }
}
