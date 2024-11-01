package com.ite.business_ms.domain;


import com.ite.business_ms.config.jpa.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends Auditable {
    @Id
    private Long id;

    private String title;

    private String alias;

    @ManyToMany
    private List<Business> businesses;
}
