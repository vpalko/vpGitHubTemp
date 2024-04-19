public class Dairy extends Product {
  String dairyType;
  boolean isLactoseFree;

  public Dairy(String dairyType, boolean isLactoseFree, boolean isVegan, String expirationDate, double price) {
    super(isVegan, expirationDate, price);
    this.dairyType = dairyType;
    this.isLactoseFree = isLactoseFree;
  }

  public String getDairyType() {
    return this.dairyType;
  }

  public void setDairyType(String dairyType) {
    this.dairyType = dairyType;
  }

  public boolean getIsLactoseFree() {
    return this.isLactoseFree;
  }

  public void setIsLactoseFree(boolean isLactoseFree) {
    this.isLactoseFree = isLactoseFree;
  }

}