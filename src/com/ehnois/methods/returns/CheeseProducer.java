package com.ehnois.methods.returns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Item 43: Return Empty arrays or Collections, not null
 * @author rafaelcfreire
 *
 */
public class CheeseProducer {

  private final List<Cheese> cheesesInStock = new ArrayList<Cheese>();
  
  /**
   * @return an array containing all of the cheeses in the shop,
   *     or null if no cheeses are available for purchase.
   */
  public List<Cheese> getCheeses() {
      if (cheesesInStock.size() == 0)
          return null;

      return cheesesInStock;
  }
  
}
