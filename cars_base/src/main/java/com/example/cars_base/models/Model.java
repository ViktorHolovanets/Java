package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Data
@DynamicInsert
@Table(name = "model")
public class Model {
    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(50)")
    private String id;
    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(name="cyrillic-name", columnDefinition = "VARCHAR(50)")
    private String  cyrillicName;
    @Column(name="class", columnDefinition = "VARCHAR(5)")
    private String  classType;
    @Column(name="year-start",columnDefinition = "SMALLINT")
    private Integer yearStart;
    @Column(name="year-to",columnDefinition = "SMALLINT")
    private Integer yearTo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mark_id", referencedColumnName = "id")
    private Mark mark;
    @OneToOne(mappedBy = "model")
    private Generation generation;
}
