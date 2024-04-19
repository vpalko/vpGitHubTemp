import java.util.ArrayList;
public class Cart {

  ArrayList<Product> shoppingCart = new ArrayList();

  public void addProduct(Product foods) {
    shoppingCart.add(foods);
  }

  public double getTotalPrice() {
    double totalPrice = 0;
    for (int i = 0; i < shoppingCart.size(); i++) {
      totalPrice = totalPrice + shoppingCart.get(i).getPrice();
    }
    return totalPrice;
  }
}