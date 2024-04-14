package task1;
import java.util.*;

public class Square {

  private int[][] square;

  // --------------------------------------
  // create new square of given size
  // --------------------------------------
  public Square(int size) {
    square = new int[size][size];

  }

  // --------------------------------------
  // create new square using given 2D array
  // --------------------------------------
  public Square(int[][] matrix) {
    square = matrix;

  }

  // --------------------------------------
  // return the square 2D array
  // --------------------------------------
  public int[][] getSquare() {
    return square;
  }

  // --------------------------------------
  // return the sum of the values in the given row
  // --------------------------------------
  public int sumRow(int row) {
    int total = 0;
    // Add code here!

    return total;
  }

  // --------------------------------------
  // return the sum of the values in the given column
  // --------------------------------------
  public int sumColumn(int col) {
    int total = 0;
    // Add code here!

    return total;
  }

  // --------------------------------------
  // return the sum of the values in the main diagonal
  // --------------------------------------
  public int sumMainDiag() {
    int total = 0;
    // Add code here!

    return total;
  }

  // --------------------------------------
  // return the sum of the values in the other ("reverse") diagonal
  // --------------------------------------
  public int sumOtherDiag() {
    int total = 0;

    return total;

  }

  // --------------------------------------
  // return true if the square is magic (all rows, cols, and diags have same sum),
  // false otherwise
  // --------------------------------------
  public boolean isMagic() {
    // Add code here!

    return true;
  }

  // --------------------------------------
  // read info into the square from the standard input.
  // --------------------------------------
  public void readSquare(Scanner scan) {
    for (int row = 0; row < square.length; row++) {
      int col = 0;
      while (true) {
        if (col == square.length) {
          break;
        }
        try {
          // a while loop that runs until there is a valid input a try block a catch block
          System.out.println("Enter an integer number");
          square[row][col] = scan.nextInt();

          col++;

        } catch (InputMismatchException err) {
          System.out.println("Sorry, you must enter an integer.");
          scan.next();
        }
      }
    }
  }

  // --------------------------------------
  // print the contents of the square, neatly formatted
  // --------------------------------------
  public void printSquare() {
    for (int row = 0; row < square.length; row++) {
      for (int col = 0; col < square.length; col++) {
        System.out.print(square[row][col] + "  ");
      }
      System.out.println("");
    }
  }
}