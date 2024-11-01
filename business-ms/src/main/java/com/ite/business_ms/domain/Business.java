package com.ite.business_ms.domain;


import com.ite.business_ms.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "business")
@Entity
public class Business extends Auditable {

    @Id
    private Long id;

    private String alias;

    private String name;

    private String imageUrl;

    private Boolean isClosed;

    private String url;

    private Integer reviewCount;

    private String rating;

    @ManyToMany
    private List<Category> categories;

    private String price;

    private String phone;

    private String displayPhone;

    private String distance;

    private Integer photosCount;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Location location;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Coordinate coordinates;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private List<SpecialHour> specialHours;

    private Boolean isClaimed;

    private String dateOpened;

    private String dateClosed;

    private String businessType;

    @ManyToMany
    @JoinTable(
            name = "business_transaction",
            joinColumns = @JoinColumn(name = "business_id"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id"))
    private List<Transaction> transaction;

    private Boolean isOpenNow;

}
