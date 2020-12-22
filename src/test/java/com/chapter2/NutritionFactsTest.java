package com.chapter2;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class NutritionFactsTest {

    private NutritionFacts nutritionFacts;

    @Test
    public void shouldCreateHealthyNutrition() {
        nutritionFacts = new NutritionFacts.Builder(100, 10)
            .calories(200)
            .build();
        assertEquals("Expected to find heathy diet", true, nutritionFacts.isHealtyDiet());
    }

    @Test
    public void shouldNotCreateHealthyNutrition() {
        nutritionFacts = new NutritionFacts.Builder(100, 10)
            .calories(5001)
            .build();
        assertEquals("Expected to find heathy diet", false, nutritionFacts.isHealtyDiet());
    }
}
