package com.wendy.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "invoices")
    public class Invoice {

        @Id
        @GeneratedValue
        private Long id;
        private String treatmentName;
        private Date invoiceDate;
        private Double price;

       // @ManyToOne(mappedBy = "invoice");
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTreatmentName() {
            return treatmentName;
        }

        public void setTreatmentName(String treatmentName) {
            this.treatmentName = treatmentName;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

