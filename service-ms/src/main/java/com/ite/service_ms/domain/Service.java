package com.ite.service_ms.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Duration;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;              // Name of the service
    private String description;       // Description of the service
    private BigDecimal price;         // Cost of the service
    private Duration duration;        // Duration of the service

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;              // Associated staff providing the service

    private Boolean isAvailable;      // Availability status
}
