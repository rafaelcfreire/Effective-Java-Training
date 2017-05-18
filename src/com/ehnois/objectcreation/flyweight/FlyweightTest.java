package com.ehnois.objectcreation.flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlyweightTest {

  @Test
  public void test() {
    String simpleText = new String("Simple Text");
    String simpleText2 = new String("Simple Text");
    
    assertNotSame(simpleText, simpleText2);
    
    String simpleText3 = "Simple Text";
    String simpleText4 = "Simple Text";
    
    assertSame(simpleText3, simpleText4);
  }

}
