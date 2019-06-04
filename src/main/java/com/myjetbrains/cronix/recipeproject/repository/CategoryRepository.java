package com.myjetbrains.cronix.recipeproject.repository;

import com.myjetbrains.cronix.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);

}
