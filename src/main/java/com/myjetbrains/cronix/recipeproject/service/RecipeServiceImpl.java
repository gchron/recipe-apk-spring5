package com.myjetbrains.cronix.recipeproject.service;

import com.myjetbrains.cronix.recipeproject.model.Recipe;
import com.myjetbrains.cronix.recipeproject.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
