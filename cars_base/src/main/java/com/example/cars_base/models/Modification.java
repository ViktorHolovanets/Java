package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "modification")
public class Modification {
    @Id
    @Column(name = "complectation_id", columnDefinition = "VARCHAR(50)")
    private String id;
    @Column(name = "offers-price-from", columnDefinition = "INT", nullable = true)
    private Integer offersPriceFrom;
    @Column(name = "offers-price-to", columnDefinition = "INT", nullable = true)
    private Integer offersPriceTo;
    @Column(name = "group-name", columnDefinition = "VARCHAR(100)", nullable = true)
    private String groupName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "configuration_id", referencedColumnName = "id")
    private Configuration configuration;
}
