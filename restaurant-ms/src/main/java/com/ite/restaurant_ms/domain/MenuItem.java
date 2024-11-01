package com.ite.restaurant_ms.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "menu_items")
@NoArgsConstructor
@Getter
@Setter
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String alias;

    private String name;

    private String imageUrl;

    private String description;

    private BigDecimal price;

    private Boolean isAvailable;

    @ManyToOne
    private MenuCategory menuCategory;

    @ManyToOne
    private Restaurant restaurant;
}
