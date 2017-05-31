package com.ehnois.objectcreation.singleton;

/**
 * Item 3: Enforce the Singleton Property with a Private Constructor or an Enum Type.
 * 
 * @author rafaelcfreire
 *
 */
public class Elvis {
 
  /**
   * One way to provide a Singleton instance is using an Enum.
   */
  private static final Elvis INSTANCE = new Elvis();
  
  /**
   * Private Constructor to avoid clients to create new instances.
   */
  private Elvis() {
  }
  
  /**
   * The other way to obtain a Singleton instance is providing a static method.
   * @return The Singleton Instance
   */
  public static Elvis getInstance() {
    return INSTANCE;
  }
  
  public void singSong(){
    System.out.println("Elvis is singing");
  }
}
