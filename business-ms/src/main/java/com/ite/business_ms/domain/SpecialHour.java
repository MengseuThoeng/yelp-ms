package com.ite.business_ms.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SpecialHour {
    private LocalDate date;
    private String start;
    private String end;
    private Boolean isClosed;
    private Boolean isOvernight;
}
