import java.util.*;
import java.io.*;

public class Store {

  ArrayList<Product> products = new ArrayList();

  public Store() {
    readProductsFromFood();
  }

  private void readProductsFromFood() {
    try {
      String line;
      int i = 0;
      BufferedReader foodRead = new BufferedReader(new FileReader("food.txt"));
      while ((line = foodRead.readLine()) != null) {
        if (i != 0) {
          String[] lineData = line.split(",");
          if (lineData[0].equalsIgnoreCase("meat")) {
            Meat meat = new Meat(
                lineData[1],
                Boolean.parseBoolean(lineData[5]),
                Boolean.parseBoolean(lineData[2]),
                lineData[3],
                Double.parseDouble(lineData[4]));
            products.add(meat);
          } else if (lineData[0].equalsIgnoreCase("veggies")) {
            Veggies veggies = new Veggies(
                lineData[1],
                Boolean.parseBoolean(lineData[5]),
                Boolean.parseBoolean(lineData[2]),
                lineData[3],
                Double.parseDouble(lineData[4]));
            products.add(veggies);
          } else if (lineData[0].equalsIgnoreCase("dairy")) {
            Dairy dairy = new Dairy(
                lineData[1],
                Boolean.parseBoolean(lineData[5]),
                Boolean.parseBoolean(lineData[2]),
                lineData[3],
                Double.parseDouble(lineData[4]));
            products.add(dairy);
          }

        }
        i++;
      }
      foodRead.close();
    } catch (Exception err) {
      System.out.println("UNABLE TO READ FILE");
      err.printStackTrace();
    }
  }

  public ArrayList<Product> getProducts() {
    return products;
  }
}