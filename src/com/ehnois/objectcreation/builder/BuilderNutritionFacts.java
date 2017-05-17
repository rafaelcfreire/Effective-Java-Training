package com.ehnois.objectcreation.builder;

/**
 * 
 * @author rafaelcfreire
 *
 */
public class BuilderNutritionFacts {
  private int vitaminA;
  private int vitaminC;
  private int vitaminD;
  private int vitaminE;
  private int vitaminK;
  private int riboflavin;
  private int vitaminB;
  private int vitaminB1;
  private int pantothenic;
  private int choline;
  private int betaine;
  private int calcium;
  private int iron;
  private int magnesium;
  private int phosphorus;
  private int potassium;
  private int sodium;
  private int zinc;
  private int manganese;
  private int selenium;
  private int saturatedFat;
  private int monounsaturatedFat;

  public static class Builder {
    //required parameters
    private int vitaminA;
    private int vitaminC;
    
    //optional parameters
    private int vitaminD = 0;
    private int vitaminE = 0;
    private int vitaminK = 0;
    private int riboflavin = 0;
    private int vitaminB = 0;
    private int vitaminB1 = 0;
    private int pantothenic = 0;
    private int choline = 0;
    private int betaine = 0;
    private int calcium = 0;
    private int iron = 0;
    private int magnesium = 0;
    private int phosphorus = 0;
    private int potassium = 0;
    private int sodium = 0;
    private int zinc = 0;
    private int manganese = 0;
    private int selenium = 0;
    private int saturatedFat = 0;
    private int monounsaturatedFat = 0;
    
    public Builder(int vitaminA, int vitaminC) {
      this.vitaminA = vitaminA;
      this.vitaminC = vitaminC;
    }
    
    public Builder vitaminD(int val){
      vitaminD = val;
      return this;
    }
    
    public Builder vitaminE(int val){
      vitaminE = val;
      return this;
    }
    
    public Builder vitaminK(int val){
      vitaminK = val;
      return this;
    }
    
    public Builder riboflavin(int val){
      riboflavin = val;
      return this;
    }
    
    public Builder vitaminB(int val){
      vitaminB = val;
      return this;
    }
    
    public Builder vitaminB1(int val){
      vitaminB1 = val;
      return this;
    }
    
    public Builder pantothenic(int val){
      pantothenic = val;
      return this;
    }
    
    public Builder choline(int val){
      choline = val;
      return this;
    }
    
    public Builder betaine(int val){
      betaine = val;
      return this;
    }
    
    public Builder calcium(int val){
      calcium = val;
      return this;
    }
    
    public Builder iron(int val){
      iron = val;
      return this;
    }
    
    public Builder magnesium(int val){
      magnesium = val;
      return this;
    }

    public Builder phosphorus(int val){
      phosphorus = val;
      return this;
    }

    public Builder potassium(int val){
      potassium = val;
      return this;
    }

    public Builder sodium(int val){
      sodium = val;
      return this;
    }

    public Builder zinc(int val){
      zinc = val;
      return this;
    }

    public Builder manganese(int val){
      manganese = val;
      return this;
    }

    public Builder selenium(int val){
      selenium = val;
      return this;
    }

    public Builder saturatedFat(int val){
      saturatedFat = val;
      return this;
    }

    public Builder monounsaturatedFat(int val){
      monounsaturatedFat = val;
      return this;
    }
    
    public BuilderNutritionFacts build() {
      return new BuilderNutritionFacts(this);
    }
  }
  
  private BuilderNutritionFacts(Builder builder) {
    this.vitaminA = builder.vitaminA;
    this.vitaminC = builder.vitaminC;
    this.vitaminD = vitaminD;
    this.vitaminE = vitaminE;
    this.vitaminK = vitaminK;
    this.riboflavin = riboflavin;
    this.vitaminB = vitaminB;
    this.vitaminB1 = vitaminB1;
    this.pantothenic = pantothenic;
    this.choline = choline;
    this.betaine = betaine;
    this.calcium = calcium;
    this.iron = iron;
    this.magnesium = magnesium;
    this.phosphorus = phosphorus;
    this.potassium = potassium;
    this.sodium = sodium;
    this.zinc = zinc;
    this.manganese = manganese;
    this.selenium = selenium;
    this.saturatedFat = saturatedFat;
    this.monounsaturatedFat = monounsaturatedFat;
  }

}
