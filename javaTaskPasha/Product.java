public class Product {

  boolean isVegan;
  String expirationDate;
  double price;

  public Product(boolean isVegan, String expirationDate, double price) {
    this.isVegan = isVegan;
    this.expirationDate = expirationDate;
    this.price = price;
  }

  public boolean getIsVegan() {
    return this.isVegan;
  }

  public void setIsVegan(boolean isVegan) {
    this.isVegan = isVegan;
  }

  public String getExpirationDate() {
    return this.expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}