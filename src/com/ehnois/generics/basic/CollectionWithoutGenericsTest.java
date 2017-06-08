package com.ehnois.generics.basic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionWithoutGenericsTest {

  @Test
  public void test() {
    /**
    List simpleList = new ArrayList();
    simpleList.add(new Integer(5));
    simpleList.add(new String("Test"));
    simpleList.add(new Integer(7));
    simpleList.add(new Integer(8));
    
    String simpleString = (String) simpleList.get(0);
**/
    
    Object[] array = new Long[1];
    array[0] = "Testing";
  }

}
