package com.ite.service_ms.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "time_slots")
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;  // Start time of the slot
    private LocalDateTime endTime;    // End time of the slot

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;          // Service associated with this time slot

    private Boolean isBooked;         // Indicates if the slot is booked
}
