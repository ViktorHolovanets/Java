package com.docker.docker.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
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

}
