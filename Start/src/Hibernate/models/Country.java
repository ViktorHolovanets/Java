package Hibernate.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
@Data
@AllArgsConstructor
@Entity
@Table
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private Long population;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "capital", referencedColumnName = "id", nullable=true)
    private City capital;
    @OneToMany(mappedBy = "country")
    private Set<City> cities;
    public Country() {    }
}
