package com.ite.restaurant_ms.domain;


import com.ite.restaurant_ms.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "menu_categories")
@Setter
@Getter
@NoArgsConstructor
public class MenuCategory extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String alias;

    private String icon;

    private String description;

    @OneToMany
    private List<MenuItem> menuItems;
}
