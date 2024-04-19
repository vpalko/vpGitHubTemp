public class Meat extends Product {

  String meatType;
  boolean isRedMeat;

  public Meat(String meatType, boolean isRedMeat, boolean isVegan, String expirationDate, double price) {
    super(isVegan, expirationDate, price);
    this.meatType = meatType;
    this.isRedMeat = isRedMeat;
  }

  public String getMeatType() {
    return this.meatType;
  }

  public void setMeatType(String meatType) {
    this.meatType = meatType;
  }

  public boolean getIsRedMeat() {
    return this.isRedMeat;
  }

  public void setIsRedMeat(boolean isRedMeat) {
    this.isRedMeat = isRedMeat;
  }

  @Override
  public String toString() {

    return this.meatType;
  }

}