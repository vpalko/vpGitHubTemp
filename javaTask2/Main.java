
/*
 * 
 *  Create the class necessary to hold the information contained in the lines of the file using an OO approach. This class should have getters and setters for any attributes, and 1 additional method.

Create objects of this type for each line in the file by reading lines of the file sequentially. Add each of the objects to an arraylist. Loop through that arraylist and call the method you created.
 */

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
      Store store = new Store();

      ArrayList<Shape> shapes = store.getShapes();

      for (int i = 0; i < shapes.size(); i++) {
        System.out.println(shapes.get(i).getShapeDetails());
      }

  }

}