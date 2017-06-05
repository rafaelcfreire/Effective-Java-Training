package com.ehnois.classesinterfaces.composition;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Test;

public class InstrumentedHashSetTest {

  @Test
  public void test() {
    InstrumentedSet<String> s = new InstrumentedSet<String>(new TreeSet<String>());
    s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
    
    assertEquals(3, s.getAddCount());  
  }

}
