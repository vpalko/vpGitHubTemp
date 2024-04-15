package javaTask1;
public class DVD extends Product {
  /**
   * Constructor for DVD class
   * 
   * @param price   the price of this DVD
   * @param name    the title of this DVD
   * @param inStock the amount of this item in stock
   */

  public DVD(double price, String name, int inStock, int productID) {
    super(price, name, inStock, productID);
  }

}