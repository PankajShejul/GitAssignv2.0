package com.app.tester;

import com.app.core.TaxCalculator;

public class Tester {
  public static void main(String[] args) {
    TaxCalculator food = new TaxCalculator(1,100,"Burger",0);
    TaxCalculator furniture=new TaxCalculator(5,75,"chair",5);
    System.out.println(food+"\n"+furniture);
  }
}
