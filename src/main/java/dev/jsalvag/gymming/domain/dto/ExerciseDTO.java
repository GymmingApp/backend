package dev.jsalvag.gymming.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExerciseDTO implements BaseDTO {
    private Long id;
    private String name;
    private Integer series;
    private Integer times;
    private Float wight;
    private String observations;
}
