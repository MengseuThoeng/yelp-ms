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
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;          // Service booked in this appointment

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;              // Staff member assigned to the appointment

    @ManyToOne
    @JoinColumn(name = "time_slot_id")
    private TimeSlot timeSlot;        // Time slot for the appointment

    private Long customerId;          // ID of the customer booking the appointment
    private LocalDateTime appointmentDate;  // Date of the appointment
}
