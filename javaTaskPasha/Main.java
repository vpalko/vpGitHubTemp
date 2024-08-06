import java.util.*;
// import java.text.DecimalFormat;  

public class Main {
  public static void main(String[] args) {

    // DecimalFormat decfor = new DecimalFormat("0.00");  

    // double test = 2.33333333;
    // System.out.println(test);
    // System.out.println("Double Number: " + decfor.format(test));    //123.99  
    // System.exit(0);

    Store groceryShop = new Store();
    ArrayList<Product> groceries = groceryShop.getProducts();
    Scanner scan = new Scanner(System.in);
    Cart shopCart = new Cart();

    boolean run = true;

    while (run) {

      System.out.println("Welcome to NinerMart! What would you like to do?");
      System.out.println("\t1. Buy meat");
      System.out.println("\t2. Buy vegetables");
      System.out.println("\t3. Buy dairy");
      System.out.println("\t4. Leave");

      int choice = 0;

      choice = scan.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Here's our selection of meat products");
          boolean selectMeat = true;
          while (selectMeat) {
            int index = 1;
            for (int i = 0; i < groceries.size(); i++) {
              if (groceries.get(i) instanceof Meat) {
                System.out.println(
                    "\t" + Integer.toString(index) + ". " + groceries.get(i).toString());
                index++;
              }
            }
            System.out.println("\t" + Integer.toString(index) + ". Exit");
            int selection = scan.nextInt();
            if (selection == index) {
              selectMeat = false;

            } else {
              index = 1;
              for (int i = 0; i < groceries.size(); i++) {
                if (groceries.get(i) instanceof Meat) {
                  if (selection == index) {
                    shopCart.addProduct(groceries.get(i));
                    break;
                  }
                  index++;
                }
              }
              System.out.println("\nTotal in cart: $" + shopCart.getTotalPrice());
            }
          }

          break;
        case 4:
          System.out.println("Have a great day!");
          System.exit(0);

      }
    }
  }
}