package com.ite.restaurant_ms.domain;

import com.ite.restaurant_ms.config.jpa.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Setter
@Getter
@NoArgsConstructor
public class Reservation extends Auditable {
    @Id
    private Long id;

    private LocalDateTime reservationDateTime;

    private Integer numberOfPeople;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String specialRequest;

    private String reservationStatus;
}
