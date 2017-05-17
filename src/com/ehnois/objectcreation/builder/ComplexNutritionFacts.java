package com.ehnois.objectcreation.builder;

/**
 * A complex class with 27 attributes. There is a pattern called Telescoping Constructor pattern
 * where 27 constructors are created with different number of parameters.
 *  
 * @author rafaelcfreire
 */
public class ComplexNutritionFacts {
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
  
  /**
   * The Javabeans pattern uses an empty constructor and set methods to set the values.
   */
  public ComplexNutritionFacts() {
  }
  
  /**
   * Telescoping Constructor
   * @param vitaminA
   */
  public ComplexNutritionFacts(int vitaminA) {
    super();
    this.vitaminA = vitaminA;
  }

  public ComplexNutritionFacts(int vitaminA, int vitaminC) {
    super();
    this.vitaminA = vitaminA;
    this.vitaminC = vitaminC;
  }

  public ComplexNutritionFacts(int vitaminA, int vitaminC, int vitaminD) {
    super();
    this.vitaminA = vitaminA;
    this.vitaminC = vitaminC;
    this.vitaminD = vitaminD;
  }

  public ComplexNutritionFacts(int vitaminA, int vitaminC, int vitaminD, int vitaminE) {
    super();
    this.vitaminA = vitaminA;
    this.vitaminC = vitaminC;
    this.vitaminD = vitaminD;
    this.vitaminE = vitaminE;
  }

  
  /**
   * 
   * @param vitaminA
   * @param vitaminC
   * @param vitaminD
   * @param vitaminE
   * @param vitaminK
   * @param thiamin
   * @param riboflavin
   * @param niacin
   * @param vitaminB
   * @param folate
   * @param vitaminB1
   * @param pantothenic
   * @param choline
   * @param betaine
   * @param calcium
   * @param iron
   * @param magnesium
   * @param phosphorus
   * @param potassium
   * @param sodium
   * @param zinc
   * @param manganese
   * @param selenium
   * @param fluoride
   * @param saturatedFat
   * @param monounsaturatedFat
   * @param polyunsaturatedFat
   */
  public ComplexNutritionFacts(int vitaminA, int vitaminC, int vitaminD, int vitaminE, int vitaminK,
      int thiamin, int riboflavin, int niacin, int vitaminB, int folate, int vitaminB1,
      int pantothenic, int choline, int betaine, int calcium, int iron, int magnesium,
      int phosphorus, int potassium, int sodium, int zinc, int manganese, int selenium,
      int fluoride, int saturatedFat, int monounsaturatedFat, int polyunsaturatedFat) {

    this.vitaminA = vitaminA;
    this.vitaminC = vitaminC;
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

  public int getVitaminA() {
    return vitaminA;
  }

  public void setVitaminA(int vitaminA) {
    this.vitaminA = vitaminA;
  }

  public int getVitaminC() {
    return vitaminC;
  }

  public void setVitaminC(int vitaminC) {
    this.vitaminC = vitaminC;
  }

  public int getVitaminD() {
    return vitaminD;
  }

  public void setVitaminD(int vitaminD) {
    this.vitaminD = vitaminD;
  }

  public int getVitaminE() {
    return vitaminE;
  }

  public void setVitaminE(int vitaminE) {
    this.vitaminE = vitaminE;
  }

  public int getVitaminK() {
    return vitaminK;
  }

  public void setVitaminK(int vitaminK) {
    this.vitaminK = vitaminK;
  }

  public int getRiboflavin() {
    return riboflavin;
  }

  public void setRiboflavin(int riboflavin) {
    this.riboflavin = riboflavin;
  }

  public int getVitaminB() {
    return vitaminB;
  }

  public void setVitaminB(int vitaminB) {
    this.vitaminB = vitaminB;
  }

  public int getVitaminB1() {
    return vitaminB1;
  }

  public void setVitaminB1(int vitaminB1) {
    this.vitaminB1 = vitaminB1;
  }

  public int getPantothenic() {
    return pantothenic;
  }

  public void setPantothenic(int pantothenic) {
    this.pantothenic = pantothenic;
  }

  public int getCholine() {
    return choline;
  }

  public void setCholine(int choline) {
    this.choline = choline;
  }

  public int getBetaine() {
    return betaine;
  }

  public void setBetaine(int betaine) {
    this.betaine = betaine;
  }

  public int getCalcium() {
    return calcium;
  }

  public void setCalcium(int calcium) {
    this.calcium = calcium;
  }

  public int getIron() {
    return iron;
  }

  public void setIron(int iron) {
    this.iron = iron;
  }

  public int getMagnesium() {
    return magnesium;
  }

  public void setMagnesium(int magnesium) {
    this.magnesium = magnesium;
  }

  public int getPhosphorus() {
    return phosphorus;
  }

  public void setPhosphorus(int phosphorus) {
    this.phosphorus = phosphorus;
  }

  public int getPotassium() {
    return potassium;
  }

  public void setPotassium(int potassium) {
    this.potassium = potassium;
  }

  public int getSodium() {
    return sodium;
  }

  public void setSodium(int sodium) {
    this.sodium = sodium;
  }

  public int getZinc() {
    return zinc;
  }

  public void setZinc(int zinc) {
    this.zinc = zinc;
  }

  public int getManganese() {
    return manganese;
  }

  public void setManganese(int manganese) {
    this.manganese = manganese;
  }

  public int getSelenium() {
    return selenium;
  }

  public void setSelenium(int selenium) {
    this.selenium = selenium;
  }

  public int getSaturatedFat() {
    return saturatedFat;
  }

  public void setSaturatedFat(int saturatedFat) {
    this.saturatedFat = saturatedFat;
  }

  public int getMonounsaturatedFat() {
    return monounsaturatedFat;
  }

  public void setMonounsaturatedFat(int monounsaturatedFat) {
    this.monounsaturatedFat = monounsaturatedFat;
  }

}
