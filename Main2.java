public class Main2 {
  public static void main(String[] args) {

    try {

      System.out.println("########### 1 #############");
      System.out.println(hashSumDigits(126, 5));
      System.out.println(hashSumDigits(49, 5));
      System.out.println(hashSumDigits(731, 5));
      System.out.println("  ");

      System.out.println("########### 2 #############");
      System.out.println(sascii("A", 10));
      System.out.println(sascii("AaBb", 100));
      System.out.println(sascii("AB", 10));
      System.out.println(sascii("ABC", 10));
      System.out.println(sascii("ABCD", 10));
      System.out.println("  ");

      System.out.println("########### 3 #############");
      System.out.println(charPosition('M'));
      System.out.println(charPosition('A'));
      System.out.println(charPosition('a'));

      System.out.println("########### 4 #############");
      System.out.println(hashAverage("Grace", 10));
      System.out.println(hashAverage("Emma", 10));
      System.out.println(hashAverage("Julia", 10));

    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }

  public static int hashSumDigits(int value, int size) {
    int sum = 0;

    while (value > 0) {
      sum += value % 10;
      value = value / 10;
    }
    return sum % size;
  }

  public static int sascii(String value, int size) {
    char[] ch = value.toCharArray();
    int sum = 0;

    for (int i = 0; i < value.length(); i++) {
      sum += ch[i]; // Add the ASCII value of the character to sum
    }

    return sum % size; // Return the sum modulo the size of the table
  }

  public static int charPosition(char ch) {
    ch = Character.toUpperCase(ch); // Convert to upper case to handle both cases
    return ch - 'A'; // Calculate position
  }

  public static int hashAverage(String value, int size) {
    int sum = 0;
    int length = value.length();

    for (int i = 0; i < length; i++) {
      sum += charPosition(value.charAt(i)); // Add the position of each character
    }

    double average = (double) sum / length; // Compute the average
    return (int) average % size; // Return the average modulo the size of the table
  }

  // Create a method to build a hash table using arrays.

}
