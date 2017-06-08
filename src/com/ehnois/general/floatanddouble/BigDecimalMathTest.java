package com.ehnois.general.floatanddouble;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalMathTest {

  @Test
  public void test() {
    assertEquals(BigDecimal.valueOf(.61), BigDecimal.valueOf(1.03).subtract(BigDecimal.valueOf(.42)));
  }

}
