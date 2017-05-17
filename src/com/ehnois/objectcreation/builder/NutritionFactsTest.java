package com.ehnois.objectcreation.builder;

import org.junit.Test;

public class NutritionFactsTest {

  @Test
  public void test() {
    
    //Creation of an object using the Builder Pattern
    BuilderNutritionFacts nutritionFacts = new BuilderNutritionFacts.Builder(150, 500).betaine(340).calcium(499).choline(84).
        magnesium(65).manganese(98).monounsaturatedFat(62).pantothenic(63).phosphorus(67).potassium(43).riboflavin(56).
        saturatedFat(98).selenium(78).sodium(67).vitaminB(45).vitaminB1(34).vitaminD(78).vitaminE(45).vitaminK(78).build();
    
    
    //Creation of an object using Javabeans pattern
    ComplexNutritionFacts complexNutritionFacts = new ComplexNutritionFacts();
    complexNutritionFacts.setBetaine(340);
    complexNutritionFacts.setCalcium(499);
    complexNutritionFacts.setCholine(84);
    complexNutritionFacts.setMagnesium(65);
    complexNutritionFacts.setManganese(98);
    complexNutritionFacts.setMonounsaturatedFat(62);
    complexNutritionFacts.setPantothenic(63);
    complexNutritionFacts.setPhosphorus(67);
    complexNutritionFacts.setPotassium(43);
    complexNutritionFacts.setRiboflavin(56);
    complexNutritionFacts.setSaturatedFat(98);
    complexNutritionFacts.setSelenium(78);
    complexNutritionFacts.setSodium(67);
    complexNutritionFacts.setVitaminA(150);
    complexNutritionFacts.setVitaminB(45);
    complexNutritionFacts.setVitaminB1(34);
    complexNutritionFacts.setVitaminC(500);
    complexNutritionFacts.setVitaminD(78);
    complexNutritionFacts.setVitaminE(45);
    complexNutritionFacts.setVitaminK(78);
  }

}
