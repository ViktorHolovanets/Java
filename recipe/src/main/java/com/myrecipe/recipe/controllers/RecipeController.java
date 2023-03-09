package com.myrecipe.recipe.controllers;

import com.myrecipe.recipe.repositories.RecipeRepository;
import com.myrecipe.recipe.vievmodels.CategoryView;
import com.myrecipe.recipe.vievmodels.RecipeView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
    final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @GetMapping("/all")
    public Collection<RecipeView> getInfo(){
        return recipeRepository.getAllRecipe();
    }
    @GetMapping("/description/{id}")
    public ResponseEntity getDescription(@PathVariable long id){
        return new ResponseEntity<>(recipeRepository.findRecipeDescriptionById(id), HttpStatus.OK);
    }
    @GetMapping("/categories")
    public ResponseEntity<Collection<CategoryView>> getCategories(){
        return new ResponseEntity<>(recipeRepository.getCategoryName(), HttpStatus.OK);
    }
}
