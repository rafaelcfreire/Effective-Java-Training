package com.ehnois.commonobjectmethods.tostring;

/**
 * Item 10: Always override toString
 *  
 * @author rafaelcfreire
 *
 */
public class PhoneNumber {
  private short areaCode;
  private short prefix;
  private short lineNumber;
  private String owner;
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
