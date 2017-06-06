package com.ehnois.methods.returns;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheeseConsumerTest {

  CheeseConsumer cheeseConsumer = new CheeseConsumer();
  
  @Test
  public void test() {
    cheeseConsumer.getCheeseFromProducer();
  }

}
