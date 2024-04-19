import java.util.ArrayList;
public class Cart {

  private double totalPrice;
  ArrayList<Product> shoppingCart = new ArrayList();

  private void addProduct(Product foods) {
    shoppingCart.add(foods);
  }

  private double getTotalPrice() {
    double totalPrice = 0;
    for (int i = 0; i < shoppingCart.size(); i++) {
      totalPrice = totalPrice + shoppingCart.get(i).getPrice();
    }
    return totalPrice;
  }
}