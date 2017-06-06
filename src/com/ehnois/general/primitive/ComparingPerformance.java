package com.ehnois.general.primitive;

/**
 * Item 49 - Prefer primitive types to boxed primitives 
 * @author rafaelcfreire
 */
public class ComparingPerformance {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    
    Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
        sum += i;
    }
    System.out.println(sum);
    
    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println(elapsedTime);    
  }

}
