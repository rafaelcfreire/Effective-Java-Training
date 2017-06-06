package com.ehnois.methods.returns;

import java.util.List;

/**
 * Item 43: Return Empty arrays or Collections, not null
 * @author rafaelcfreire
 *
 */
public class CheeseConsumer {

  private CheeseProducer cheeseProducer = new CheeseProducer();
  
  public void getCheeseFromProducer() {
    List<Cheese> cheeseList = cheeseProducer.getCheeses();
    cheeseList.size();
  }
}
