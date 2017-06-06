package com.ehnois.general.floatanddouble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FloatDoubleMathTest {

  @Test
  public void test() {
    double value1 = 1.03;
    double value2 = .42;
    
    assertEquals(.61, value1 - value2, 0);
  }

}
