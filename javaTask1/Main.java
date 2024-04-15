import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    try {
      FileWriter myWriter = new FileWriter("testfile1.txt");

      Bookstore store = new Bookstore();
      ArrayList<Product> inventory = store.getInventory();

      for (int i = 0; i < inventory.size(); i++) {
        if (inventory.get(i) instanceof Book) {
          myWriter.write(Integer.toString(inventory.get(i).getProductID()) + ", " + inventory.get(i).getName() + ", "
              + ((Book) inventory.get(i)).getAuthor() + ", "
              + inventory.get(i).getPrice() + ", " + Integer.toString(inventory.get(i).getInStock()) + "\n");
        }
      }

      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
