package com.ehnois.general.stringconcatenation;

public class StringBuilderConcatenationPerformance {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    
    
    StringBuilder b = new StringBuilder(5000);
    for (int i = 0; i < 50000; i++)
      b.append(i);
    System.out.println("********************************");
    
    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println(elapsedTime);    

  }

}
