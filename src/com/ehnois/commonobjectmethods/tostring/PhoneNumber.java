package com.ehnois.commonobjectmethods.tostring;

/**
 * Item 10: Always override toString
 * In favor of readability of the object's representation, you can override the method toString.
 * 
 * @author rafaelcfreire
 */
public class PhoneNumber {
  private short areaCode;
  private short prefix;
  private short lineNumber;
  private String owner;
  //Attribute that is not relevant to object's representation
  private int age;
  
  public PhoneNumber(short areaCode, short prefix, short lineNumber, String owner, int age) {
    super();
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNumber = lineNumber;
    this.owner = owner;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Area Code: "+areaCode+", Prefix: "+prefix+", Line Number: "+lineNumber+". Owner: "+owner;
  }
  
  
}
