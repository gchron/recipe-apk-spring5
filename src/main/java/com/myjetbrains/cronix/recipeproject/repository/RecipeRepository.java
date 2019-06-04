package com.myjetbrains.cronix.recipeproject.repository;

import com.myjetbrains.cronix.recipeproject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
