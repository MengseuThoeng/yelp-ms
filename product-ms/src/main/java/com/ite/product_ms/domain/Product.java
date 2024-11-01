package com.ite.product_ms.domain;

import com.ite.product_ms.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String imageUrl;

    private Double price;

    private Boolean isAvailable;

    private String alias;

    private Long businessId;

    @OneToMany
    private List<Inventory> inventories;

}
