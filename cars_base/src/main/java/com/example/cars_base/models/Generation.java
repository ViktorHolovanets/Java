package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Data
@DynamicInsert
@Table(name = "generation")
public class Generation {
    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(50)")
    private String id;
    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(name="year-start",columnDefinition = "SMALLINT")
    private Integer yearStart;
    @Column(name="year-stop",columnDefinition = "SMALLINT")
    private Integer yearStop;
    @Column(name="is-restyle",columnDefinition = "TINYINT")
    private Integer isRestyle;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;
    @OneToOne(mappedBy = "generation")
    private Configuration configuration;
}
