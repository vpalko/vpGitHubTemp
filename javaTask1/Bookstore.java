import java.io.*;
import java.util.*;

/**
 *
 * @author wicke
 */
public class Bookstore {

    ArrayList<Product> inventory = new ArrayList();

    /**
     * Constructor. Calls helper methods that generate arraylists of products and
     * members
     */
    public Bookstore() {

        generateInventory();

    }

    private void generateInventory() {

        Book book1 = new Book("Harper Lee", 9.99, "To Kill A Mockingbird", 5, 1);
        Book book2 = new Book("E.B. White", 7.99, "Charlotte's Web", 7, 2);

        inventory.add(book1);
        inventory.add(book2);

    }

    /**
     * Getter for inventory
     * 
     * @return An ArrayList of Products
     */
    public ArrayList<Product> getInventory() {
        return inventory;
    }

}