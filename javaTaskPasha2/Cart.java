import java.util.ArrayList;
import java.text.DecimalFormat;
public class Cart {

    DecimalFormat dec = new DecimalFormat("0.00");
    ArrayList<Product> shopCart = new ArrayList();

    public void showCart() {
        for (int i = 0; i < shopCart.size(); i++) {
            System.out.println("\t" + shopCart.get(i).toString());
            System.out.println("\t release year: " + shopCart.get(i).getReleaseYear());
            System.out.println("\t genres: " + shopCart.get(i).getGenres());
            System.out.println("\t age rating: " + shopCart.get(i).getAgeRating());
            System.out.println("\t price: $" + shopCart.get(i).getPrice());
            if (shopCart.get(i)instanceof Movie) {
                System.out.println("\t runtime in minutes: " + ((Movie) shopCart.get(i)).getRunTime());
            }
            else if (shopCart.get(i)instanceof Game) {
                System.out.println("\t system: " + ((Game) shopCart.get(i)).getSystem());
            }
        }
        System.out.println("\n The total price of your cart is $" + dec.format(this.getTotalPrice()));
    }
    public void addProduct(Product media) {
    shopCart.add(media);
  }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < shopCart.size(); i++) {
          totalPrice = totalPrice + shopCart.get(i).getPrice();
        }
        return totalPrice;
      }
}