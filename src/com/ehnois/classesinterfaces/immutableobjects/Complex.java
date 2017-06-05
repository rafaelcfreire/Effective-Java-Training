package com.ehnois.classesinterfaces.immutableobjects;

/**
 * Item 15: Minimize Mutability
 * @author rafaelcfreire
 * Code taken from "Effective Java" book by Joshua Block. Page 75
 */
public final class Complex {

  
  /**
   * Immutable classes should take advantage of this by encouraging clients to reuse existing instances wherever
   * possible. One easy way to do this is to provide public static final constants for fre- quently used values. 
   * For example, the Complex class might provide these con- stants 
   */
  public static final Complex ZERO = new Complex(0, 0);
  public static final Complex ONE  = new Complex(1, 0);
  public static final Complex I    = new Complex(0, 1);
  
  
  private final double re;
  
  private final double im;
  
  public Complex(double re, double im) {
      this.re = re;
      this.im = im;
  }

  // Accessors with no corresponding mutators
  public double realPart() { 
    return re; 
  }

  public double imaginaryPart() { 
    return im; 
  }

  public Complex add(Complex c) {
      return new Complex(re + c.re, im + c.im);
  }

  public Complex subtract(Complex c) {
      return new Complex(re - c.re, im - c.im);
  }

  public Complex multiply(Complex c) {
      return new Complex(re * c.re - im * c.im,
                         re * c.im + im * c.re);
  }

  public Complex divide(Complex c) {
      double tmp = c.re * c.re + c.im * c.im;
      return new Complex((re * c.re + im * c.im) / tmp,
                         (im * c.re - re * c.im) / tmp);
  }

  @Override 
  public boolean equals(Object o) {
     if (o == this)
         return true;
     if (!(o instanceof Complex))
         return false;
     Complex c = (Complex) o;
     
     //See page 43 to find out why we use compare instead of == 
     return Double.compare(re, c.re) == 0 &&
     Double.compare(im, c.im) == 0;
  }
  
  @Override 
  public int hashCode() {
    int result = 17 + hashDouble(re);
    result = 31 * result + hashDouble(im);
    return result;
  }
  
  private int hashDouble(double val) {
      long longBits = Double.doubleToLongBits(re);
      return (int) (longBits ^ (longBits >>> 32));
  }
  
  @Override 
  public String toString() {
      return "(" + re + " + " + im + "i)";
  }  
}
