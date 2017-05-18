package com.ehnois.objectcreation.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

  @Test
  public void test() {
    //Testing the ENUM instance
    assertEquals(ElvisEnum.INSTANCE, ElvisEnum.INSTANCE);
    
    //Testing the singleton instance
    assertEquals(Elvis.getInstance(), Elvis.getInstance());
  }
}
