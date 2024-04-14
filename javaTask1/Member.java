package task1;
public class Member extends Person  {
  private int numberPurchases;
  public Member(String name, int numberPurchases) {
      super(name);
  }
  public int getNumPurchases() {
      return numberPurchases;
  }
  public void setNumberPurchases(int numberPurchases) {
      this.numberPurchases = numberPurchases;
  }
}