package com.ite.business_ms.domain;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Location {
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String zipCode;
    private String country;
    private String state;



}
