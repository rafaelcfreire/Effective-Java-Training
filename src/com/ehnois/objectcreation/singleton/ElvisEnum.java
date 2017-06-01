package com.ehnois.objectcreation.singleton;

/**
 * Item 3: Enforce the Singleton Property with a Private Constructor or an Enum Type.
 * 
 * @author rafaelcfreire
 */
public enum ElvisEnum {
  /**
   * Enum instance of an Elvis object
   */
  INSTANCE;
  
  public void singSong(){
    System.out.println("Elvis is singing");
  }
}
