package com.ehnois.generics.basic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionWithGenericsTest {

  @Test
  public void test() {
    List<Integer> simpleList = new ArrayList<Integer>();
    simpleList.add(new Integer(5));
    simpleList.add(new Integer(6));
    //Compile error
    //simpleList.add(new String("Test"));
  }

}
