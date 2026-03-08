package com.G24.FitnessTracker.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gym")
@Getter
@Setter
@NoArgsConstructor
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gymId;

    private String gymName;
    private String location;

    @OneToMany(mappedBy = "gym", cascade = CascadeType.ALL)
    private List<Workout> workouts;

    @OneToMany(mappedBy = "gym", cascade = CascadeType.ALL)
    private List<Equipment> equipmentList;
}
