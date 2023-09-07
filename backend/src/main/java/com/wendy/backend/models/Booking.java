package com.wendy.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_time")
    private LocalDateTime dateTime; //koppeling in SQL. misschien beter om apart aan te spreken?

    @JsonIgnore
    @ManyToOne
    @Column(name = "treatment_id")
   private Treatment chosenTreatment;
   // private String treatmentType;

    @JsonIgnore
    @ManyToOne
    @Column(name = "customer_id")
    private User customer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private User staff;

    //invoice koppelen ook?

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Treatment getChosenTreatment() {
        return chosenTreatment;
    }

    public void setChosenTreatment(Treatment chosenTreatment) {
        this.chosenTreatment = chosenTreatment;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getStaff() {
        return staff;
    }

    public void setStaff(User staff) {
        this.staff = staff;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }


}
