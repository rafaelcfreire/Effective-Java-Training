package com.ehnois.commonobjectmethods.equalshashcodecontract;

import static org.junit.Assert.assertNull;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * @author Rafael_Cassemiro_Fre
 *
 */
public class EqualsHashCodeContractTest {

  @Test
  public void test() {
    PhoneNumber phoneNumber = new PhoneNumber(707, 867, 5309);
    PhoneNumber phoneNumber2 = new PhoneNumber(707, 867, 5310);
    
    Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
    m.put(phoneNumber, "Jenny");    
    
    assertNull(m.get(phoneNumber2));
  }

}
