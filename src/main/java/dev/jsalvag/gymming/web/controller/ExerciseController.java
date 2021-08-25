package dev.jsalvag.gymming.web.controller;

import dev.jsalvag.gymming.domain.dto.ExerciseDTO;
import dev.jsalvag.gymming.domain.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("exercise")
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciseDTO> list() {
        return exerciseService.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExerciseDTO create(@RequestBody ExerciseDTO body) {
        return exerciseService.create(body);
    }
}
