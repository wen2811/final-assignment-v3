package com.wendy.backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "treatments")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Treatment name is required")
    private String name;

    @Enumerated(EnumType.STRING)
    private TreatmentType type; // Type of treatment (facial or body)

    @Column(columnDefinition = "TEXT")
    private String description;

    private Duration duration;

    private double price;

    @OneToMany(mappedBy = "chosenTreatment", cascade = CascadeType.ALL)//remove a treatment, all booking associated wil delete??
    private Set<Booking> bookings = new HashSet<>();

}
