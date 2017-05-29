package com.ehnois.commonobjectmethods.equals.transitivity;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author rafaelcfreire
 *
 */
public class TransitivityEqualsTest {

  @Test
  public void test() {
    ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
    Point p2 = new Point(1, 2);
    ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
   
    assertTrue(p1.equals(p2));
    assertTrue(p2.equals(p3));
    
    //assertTrue(p1.equals(p3));
  }

}
