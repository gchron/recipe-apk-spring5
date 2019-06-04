package com.myjetbrains.cronix.recipeproject.service;

import com.myjetbrains.cronix.recipeproject.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
