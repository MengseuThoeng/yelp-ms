package com.ite.product_ms.domain;

import com.ite.product_ms.config.jpa.Auditable;
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
@Table(name = "inventory")
public class Inventory extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;      // Reference to the associated product

    private Integer stock;        // Current stock level for the product in this inventory location

    private String location;      // Location name or ID (e.g., "Warehouse A", "Store #101")

    private Boolean isAvailable;  // Indicates if the inventory item is available for sale
}
