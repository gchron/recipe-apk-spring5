package com.myjetbrains.cronix.recipeproject.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void setId(){
        Long idValue = 4l;

        category.setId(idValue);

        Assertions.assertEquals(idValue, category.getId());
    }
}