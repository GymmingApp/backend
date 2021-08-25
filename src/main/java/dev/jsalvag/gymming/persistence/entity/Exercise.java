package dev.jsalvag.gymming.persistence.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Exercise implements BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(255)")
    private String name;
    private Integer series;
    private Integer times;
    private Float wight;
    @Column(columnDefinition = "TEXT")
    private String observations;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Exercise exercise = (Exercise) o;

        return Objects.equals(id, exercise.id);
    }

    @Override
    public int hashCode() {
        return 596680006;
    }
}
