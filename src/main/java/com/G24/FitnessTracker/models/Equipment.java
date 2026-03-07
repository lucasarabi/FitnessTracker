package com.G24.FitnessTracker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="equipment")
@Getter
@Setter
@NoArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gymid", nullable = false)
    private Gym gym; 

    private String equipName;
    private String status;
    
}
