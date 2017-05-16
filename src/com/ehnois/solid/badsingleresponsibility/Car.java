package com.ehnois.solid.badsingleresponsibility;

/**
 * This class represents an example of a bad design that does not follow
 * the "Single Responsibility Principle". Notice that the entity Car have
 * properties and is responsible for doing many things that aren't duties of a
 * car in a correct design. The Single Responsibility Principle is useful for designing
 * classes and modules
 * 
 * 
 * @author rafaelcfreire
 */
public class Car {

  private String model;
  
  private String wheels;
  
  private String serialNumber;
  
  private long driverLicense;
  
  private boolean maritalState;
  
  
}
