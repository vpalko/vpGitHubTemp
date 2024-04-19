public class Veggies extends Product {

  String vegType;
  boolean isGreenLeaf;

  public Veggies(String vegType, boolean isGreenLeaf, boolean isVegan, String expirationDate, double price) {
    super(isVegan, expirationDate, price);
    this.vegType = vegType;
    this.isGreenLeaf = isGreenLeaf;
  }

  public String getVegType() {
    return this.vegType;
  }

  public void setVegType(String vegType) {
    this.vegType = vegType;
  }

  public boolean getIsGreenLeaf() {
    return this.isGreenLeaf;
  }

  public void setIsGreenLeaf(boolean isGreenLeaf) {
    this.isGreenLeaf = isGreenLeaf;
  }

}