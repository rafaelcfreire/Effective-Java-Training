package com.ehnois.general.stringconcatenation;

public class StringConcatenationPerformance {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    String result = "";
    for (int i = 0; i < 50000; i++)
        result += i;  // String concatenation
    System.out.println(result);
    
    System.out.println("********************************");
    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println(elapsedTime);    
  }

}
