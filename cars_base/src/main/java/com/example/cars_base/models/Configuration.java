package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "configuration")
public class Configuration {
    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(50)")
    private String id;
    @Column(name="doors-count",columnDefinition = "TINYINT")
    private Integer doorsCount;
    @Column(name = "body-type", columnDefinition = "VARCHAR(50)")
    private String bodyType;
    @Column(name = "notice", columnDefinition = "VARCHAR(50)")
    private String notice;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "generation_id", referencedColumnName = "id")
    private Generation generation;
    @OneToOne(mappedBy = "configuration")
    private Modification modification;
}
