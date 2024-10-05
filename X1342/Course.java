package X1342;

public class Course implements Comparable<Course> {
  private String dept;
  private int number;
  public Course(String d, int n) {
    dept = d;
    number = n;
  }

  public String getDept() {
    return dept;
  }

  public int getNum() {
    return number;
  }

  public String toString() {
    return getDept() + getNum();
  }

  public int compareTo(Course other) {
    if (other == null) {
      return -1;
    } else if (Integer.parseInt(this.getDept()) < Integer.parseInt(other.getDept())) {
      return -1;
    } else if (Integer.parseInt(this.getDept()) == Integer.parseInt(other.getDept())) {
      if (this.getNum() < other.getNum()) {
        return -1;
      } else if (this.getNum() == other.getNum()) {
        return 0;
      } else {
        return 1;
      }
    }
    return 1;
  }
}
