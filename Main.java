import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
    User newUser = new User();

    while (true) {// %%%
      try {// %%%
        System.out.println("Please enter the user's first name:");
        String fname = scnr.nextLine();
        newUser.setFirstName(fname);

        break;// %%%

      } catch (Exception err2) {// %%%
        System.out.println(err2.getMessage());
      }
    } // %%%

    while (true) {// %%%
      try {// %%%
        System.out.println("Please enter the user's last name:");
        String lname = scnr.nextLine();
        newUser.setLastName(lname);
        break;// %%%
      } catch (Exception err2) {// %%%
        System.out.println(err2.getMessage());
      }
    } // %%%

    while (true) {// %%%
      try {// %%%
        System.out.println("Please enter the user's birthday in the format mm/dd/yyyy:");
        String bday = scnr.nextLine();
        newUser.setBirthday(bday);
        break;// %%%
      } catch (Exception err2) {// %%%
        System.out.println(err2.getMessage());
      }
    } // %%%

    while (true) {// %%%
      try {// %%%
        System.out.println("Please enter the user's password:");
        String psw = scnr.nextLine();
        newUser.setPassword(psw);
        break;// %%%
      } catch (Exception err2) {// %%%
        System.out.println(err2.getMessage());
      }
    } // %%%

    while (true) {// %%%
      try {// %%%
        System.out.println("Please enter the user's zipcode:");
        int zip = scnr.nextInt();
        newUser.setZipcode(zip);
        break;// %%%
      } catch (Exception err2) {// %%%
        System.out.println(err2.getMessage());
      }
    } // %%%

    scnr.close();

  }
}
