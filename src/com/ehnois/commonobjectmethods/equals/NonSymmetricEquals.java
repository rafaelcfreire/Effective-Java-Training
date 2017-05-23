package com.ehnois.commonobjectmethods.equals;
/**
 * Item 8 from Effective Java Book: Obey the general contract when overriding equals
 * @author rafaelcfreire
 *
 */
public class NonSymmetricEquals {
  private final String s;
  
  public NonSymmetricEquals(String s) {
    if (s == null)
      throw new NullPointerException();
    this.s = s;
  }
  
  @Override
  public boolean equals(Object o) {
    if (o instanceof String)
      return s.equalsIgnoreCase((String)o);
    return false;
  }
}
