package com.ehnois.commonobjectmethods.equalshashcodecontract;

/**
 * Item 9: Always override hashCode when you override equals.
 * In a case that the hashcode is not provided, two identical objects will be stored
 * in different buckets for HashMaps which will avoid an object to be retrieved.
 *  
 * @author rafaelcfreire
 *
 */
public class PhoneNumber {
  private final short areaCode;
  private final short prefix;
  private final short lineNumber;
  
  public PhoneNumber(int areaCode, int prefix,
      int lineNumber) {
    rangeCheck(areaCode,    999, "area code");
    rangeCheck(prefix,      999, "prefix");
    rangeCheck(lineNumber, 9999, "line number");
    this.areaCode  = (short) areaCode;
    this.prefix  = (short) prefix;
    this.lineNumber = (short) lineNumber;
  }
  
  private static void rangeCheck(int arg, int max,
      String name) {
    if (arg < 0 || arg > max)
      throw new IllegalArgumentException(name +": " + arg);
  }

  @Override 
  public boolean equals(Object o) { 
    if (o == this)
      return true;
    if (!(o instanceof PhoneNumber))
      return false;
  PhoneNumber pn = (PhoneNumber)o;
    return pn.lineNumber == lineNumber
    && pn.prefix  == prefix
    && pn.areaCode  == areaCode;
  }

  @Override
  public int hashCode() {
    return 51;
  }
 
  

}
