import java.util.*;

public class Bookstore implements BookstoreSpecification {

    ArrayList<Product> inventory = new ArrayList();

    /**
     * Constructor. Calls helper methods that generate arraylists of products and
     * members
     */
    public Bookstore() {

        generateInventory();

    }

    public void restockProduct(int productID, int amountProduct) {
        for (Product product : getInventory()) {
            if (product.getProductID() == productID) {
                product.addInStock(amountProduct);
                break;
            }
        }
    }

    private void generateInventory() {

        Book book1 = new Book("Harper Lee", 9.99, "To Kill A Mockingbird", 5, 1);
        Book book2 = new Book("E.B. White", 7.99, "Charlotte's Web", 7, 2);
        DVD dvd1 = new DVD(15.99, "How To Train Your Dragon", 3, 4);

        inventory.add(book1);
        inventory.add(book2);
        // inventory.add(cd1);
        inventory.add(dvd1);

    }

    /**
     * getter for inventory
     * 
     * @return arraylist of Products
     */
    public ArrayList<Product> getInventory() {
        return inventory;
    }

}