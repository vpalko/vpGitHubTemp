import java.io.*;
import java.util.*;
import java.io.FileReader;

public class Store {

  ArrayList<Shape> shapes = new ArrayList();

  /**
   * Constructor. Calls helper methods that generate arraylists of products and
   * members
   */
  public Store() {

    readShapesFromFile();

  }

  private void readShapesFromFile() {
    String line;
    try {

      BufferedReader bufferreader = new BufferedReader(new FileReader("testfile2.txt"));

      int i = 0;
      while ((line = bufferreader.readLine()) != null) {
        if (i != 0) {
          String[] lineData = line.split(",");

          Shape shape = new Shape(i, lineData[0], Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]));
          shapes.add(shape);
        }

        i++;
      }

      bufferreader.close();

    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

  public ArrayList<Shape> getShapes() {
    return shapes;
  }
}