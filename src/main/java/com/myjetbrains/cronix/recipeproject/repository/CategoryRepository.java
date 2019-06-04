package com.myjetbrains.cronix.recipeproject.repository;

import com.myjetbrains.cronix.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
