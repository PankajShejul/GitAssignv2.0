package com.app.core;

public class TaxCalculator {
  private int quantity;
  private int price;
  private String name;
  private int gstRate;

  public TaxCalculator(int quantity, int price, String name, int gstRate) {
    this.quantity = quantity;
    this.price = price;
    this.name = name;
    this.gstRate = gstRate;
  }

  public double getTotalPrice() {
    return (quantity * price) + ((gstRate / 100) * (quantity * price));
  }

  @Override
  public String toString() {
    return "TaxCalculator{" +
        "quantity=" + quantity +
        ", price=" + price +
        ", name='" + name + '\'' +
        ", gstRate=" + gstRate +
        ", Total Price=" + this.getTotalPrice() +
        '}';
  }
}

