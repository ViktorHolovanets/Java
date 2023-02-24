package Hibernate.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String author;
    @Column
    private int year;
    @Column
    private String genre;
    @Column
    private int countPage;
    @Column
    private String description;

    public Book() {    }
}
