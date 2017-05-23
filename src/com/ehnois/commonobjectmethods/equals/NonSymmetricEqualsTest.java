package com.ehnois.commonobjectmethods.equals;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonSymmetricEqualsTest {

  @Test
  public void test() {
    NonSymmetricEquals nonSymmetricEquals = new NonSymmetricEquals("Test String");
    String nonSymmetricString = "test string";
    assertEquals(nonSymmetricEquals, nonSymmetricString);
    
    //assertEquals(nonSymmetricString, nonSymmetricEquals);

  }

}
