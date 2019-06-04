package com.myjetbrains.cronix.recipeproject.service;

import com.myjetbrains.cronix.recipeproject.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
}
