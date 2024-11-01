package com.ite.business_ms.domain;


import com.ite.business_ms.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transactions")
@NoArgsConstructor
@Getter
@Setter
public class Transaction extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String alias;

}
