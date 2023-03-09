package com.myrecipe.recipe.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    private Double rating;
    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
