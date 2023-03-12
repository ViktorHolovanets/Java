package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "mark")
public class Mark {
    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(50)")
    private String id;
    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(name="cyrillic-name", columnDefinition = "VARCHAR(50)")
    private String  cyrillicName;
    @Column(columnDefinition = "TINYINT")
    private Integer popular;
    @Column(name="country", columnDefinition = "VARCHAR(50)")
    private String country;
    @OneToOne(mappedBy = "mark")
    private Model model;
}
