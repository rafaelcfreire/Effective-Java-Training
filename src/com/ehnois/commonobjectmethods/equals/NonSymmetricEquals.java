package com.ehnois.commonobjectmethods.equals;
/**
 * Item 8 from Effective Java Book: Obey the general contract when overriding equals
 * Symmetry Example: Two objects must agree when they are equal. If x.equals(y) = true, then
 * y.equals(x) must be true.
 * 
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
