package com.ehnois.commonobjectmethods.tostring;

/**
 * Item 10: Always override toString
 * In favor of readability of the object's representation, you can override the method toString.
 * 
 * @author rafaelcfreire
 */
public class PhoneNumber  {
  private int areaCode;
  private int prefix;
  private int lineNumber;
  private String owner;
  //Attribute that is not relevant to object's representation
  private int age;
  
  public PhoneNumber(int areaCode, int prefix, int lineNumber, String owner, int age) {
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
