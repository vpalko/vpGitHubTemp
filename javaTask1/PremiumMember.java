package task1;
public class PremiumMember extends Member {
    
  private boolean hasPaidDues;
  public PremiumMember(boolean hasPaidDues, String name, int numberPurchases) {
      super(name, numberPurchases);
  }
  public boolean getPaidDues() {
      return hasPaidDues;
  }
  public boolean payDues() {
      this.hasPaidDues = !this.hasPaidDues;
      return hasPaidDues;
  }
}