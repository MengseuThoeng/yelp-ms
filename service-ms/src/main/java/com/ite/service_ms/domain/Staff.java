package com.ite.service_ms.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;              // Name of the staff member
    private String position;          // Position or role (e.g., "Therapist", "Trainer")
    private String phoneNumber;       // Contact phone number

    private Boolean isAvailable;      // Availability status
}
