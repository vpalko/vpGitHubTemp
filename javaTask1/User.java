package task1;
public class User {

  private String firstName;
  private String lastName;
  private String password;
  private String birthday;
  private int zipcode;

  public User() {
  }

  public void setFirstName(String firstName) {
    if (firstName.trim().equals("")) {// %%%
      throw new IllegalArgumentException("First name must not to be empty.");// %%%
    }// %%%

    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    if (lastName.trim().equals("")) {// %%%
      throw new IllegalArgumentException("Last name must not to be empty.");// %%%
    }// %%%

    this.lastName = lastName;
  }

  public void setPassword(String password) {
    if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
      throw new IllegalArgumentException("Password must have capital letter. Password must have lowercase letter.");// %%%
    }

    this.password = password;
  }

  public void setBirthday(String birthday) {
    if (birthday.trim().length() != 10) {// %%%
      throw new IllegalArgumentException("Birth day shoulb e 10 characters.");// %%%
    }// %%%

    this.birthday = birthday;
  }

  public void setZipcode(int zipcode) {
    if (Integer.toString(zipcode).trim().length() != 5) {// %%%
      throw new IllegalArgumentException("Zip code must be five characters.");// %%%
    }// %%%

    this.zipcode = zipcode;
  }

  public String getFirstName() {// %%%
    return this.firstName;// %%%
  }// %%%

}