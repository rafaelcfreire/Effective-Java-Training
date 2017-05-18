package com.ehnois.objectcreation.singleton;

/**
 * 
 * @author rafaelcfreire
 *
 */
public class Elvis {
 
  /**
   * 
   */
  private static final Elvis INSTANCE = new Elvis();
  
  /**
   * Private Constructor
   */
  private Elvis() {
  }
  
  /**
   * 
   * @return The Singleton Instance
   */
  public static Elvis getInstance() {
    return INSTANCE;
  }
  
  public void singSong(){
    System.out.println("Elvis is singing");
  }
}
