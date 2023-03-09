package com.myrecipe.recipe.repositories;

import com.myrecipe.recipe.models.Recipe;
import com.myrecipe.recipe.vievmodels.CategoryView;
import com.myrecipe.recipe.vievmodels.RecipeView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface  RecipeRepository extends CrudRepository<Recipe, Long> {
    @Query("SELECT r.name as name,r.description as description,r.rating as rating  FROM Recipe r")
    Collection<RecipeView> getAllRecipe();
    @Query("SELECT r.description FROM Recipe r WHERE r.id=:id")
    Collection<String> findRecipeDescriptionById(Long id);
    @Query("SELECT c.name as name FROM Category c")
    Collection<CategoryView> getCategoryName();

    @Query("SELECT recipe.name as name FROM Category c inner join C.recipeSet recipe WHERE c.id=:category_id ORDER BY recipe.rating DESC limit 3")
    Collection<CategoryView> getTopThreeRecipeByCategory(Long category_id);
}
