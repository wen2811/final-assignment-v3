package com.wendy.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firsName;
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "customer")
    private Set<Appointment> appointments; //appoint booked by the customer

    @OneToMany(mappedBy = "staff")
    private Set<Appointment> assignedAppointments; // Appointments assigned to staff
}
