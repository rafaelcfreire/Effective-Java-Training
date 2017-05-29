package com.ehnois.commonobjectmethods.equals.transitivity;

/**
 * Item 8 from Effective Java Book: Obey the general contract when overriding equals
 * Transitivity Example: If one object is equal to a second and the second is equal to a third,
 * then the first object must be equal to the third.
 * 
 * @author rafaelcfreire
 *
 */
public class ColorPoint extends Point {

  private final Color color;
  
  public ColorPoint(int x, int y, Color color) {
    super(x, y);
    this.color = color;
  }
  
  //Broken - violates transitivity!
  @Override public boolean equals(Object o) {
    if (!(o instanceof Point))
        return false;
    
    // If o is a normal Point, do a color-blind comparison
    if (!(o instanceof ColorPoint))
        return o.equals(this);
    
    // o is a ColorPoint; do a full comparison
    return super.equals(o) && ((ColorPoint)o).color == color;
  }
  
}
