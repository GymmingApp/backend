package dev.jsalvag.gymming.domain.repository;

import dev.jsalvag.gymming.persistence.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
