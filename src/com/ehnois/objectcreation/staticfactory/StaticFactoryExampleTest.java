package com.ehnois.objectcreation.staticfactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StaticFactoryExampleTest {

  @Test
  public void test() {
    //Comparing the objects created by constructor
    StaticFactoryExample staticFactoryObject = new StaticFactoryExample(5);
    StaticFactoryExample staticFactoryObject2 = new StaticFactoryExample(5);
    assertFalse(staticFactoryObject.equals(staticFactoryObject2));

    //Comparing the objects created by static method
    StaticFactoryExample staticFactoryObject3 = StaticFactoryExample.getObjectsWithSize5();
    StaticFactoryExample staticFactoryObject4 = StaticFactoryExample.getObjectsWithSize5();
    assertTrue(staticFactoryObject3.equals(staticFactoryObject4));
  }

}
