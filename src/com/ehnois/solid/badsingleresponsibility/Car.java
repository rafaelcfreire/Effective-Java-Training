package com.ehnois.solid.badsingleresponsibility;

/**
 * This class represents an example of a bad design that does not follow
 * the "Single Responsibility Principle". Notice that the entity Car have
 * properties and is responsible for doing many things that aren't duties of a
 * car in a correct design. We are going to use this class as a scaffold to create 
 * a component that adheres to S.O.L.I.D principles and use some good practices
 * we have learned in the class.
 * 
 * @author rafaelcfreire
 */
public class Car {

  private String model;
  
  private String wheels;
  
  private String serialNumber;
  
  private long driverLicense;
  
  private boolean maritalState;
  
  private int ownerAge;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getWheels() {
    return wheels;
  }

  public void setWheels(String wheels) {
    this.wheels = wheels;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public long getDriverLicense() {
    return driverLicense;
  }

  public void setDriverLicense(long driverLicense) {
    this.driverLicense = driverLicense;
  }

  public boolean isMaritalState() {
    return maritalState;
  }

  public void setMaritalState(boolean maritalState) {
    this.maritalState = maritalState;
  }

  public int getOwnerAge() {
    return ownerAge;
  }

  public void setOwnerAge(int ownerAge) {
    this.ownerAge = ownerAge;
  }
  
}
