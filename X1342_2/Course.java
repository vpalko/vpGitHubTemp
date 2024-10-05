package X1342_2;

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

   // Complete the compareTo() method in the class above as described below. The

   // If the department in this object is less than the department in other, return
   // a negative value (< 0).
   // If the department in this object is equal to the department in other, then
   // compare the course number and return a negative value if this number is less
   // than the course number of the other. If the numbers are equal, return 0. If
   // the other is larger than the number in this object, then return a positive
   // number.
   // Otherwise return a positive number (> 0).
   public int compareTo(Course other) {
      if (other == null || other.getDept().equals("") || this.getDept().equals("")) {
         return -1;
      } else {
         String thisDeptId = this.getDept().substring(4);
         String otherDeptId = other.getDept().substring(4);
         if (thisDeptId.equals("")) {
            thisDeptId = "0";
         }
         if (otherDeptId.equals("")) {
            otherDeptId = "0";
         }

         if (Integer.parseInt(thisDeptId) < Integer.parseInt(otherDeptId)) {
            return -1;
         } else if (Integer.parseInt(thisDeptId) == Integer.parseInt(otherDeptId)) {
            if (this.getNum() < other.getNum()) {
               return -1;
            } else if (this.getNum() == other.getNum()) {
               return 0;
            } else {
               return 1;
            }
         }

      }
      return 1;
   }

   // Define the method contains() that takes two parameters:
   // Course[] courses - an array of Course objects
   // Course lookFor - a Course object
   // This method should return true if the course lookFor exists in courses, false
   // otherwise. You must use a loop to iterate over the courses array.
   boolean contains(Course[] courses, Course lookFor) {
      for (Course course : courses) {
         if (course.equals(lookFor)) {
            return true;
         }
      }
      return false;
   }

   // Define the method findSmallest() that an array of courses:
   // This method returns the smallest value in the array of courses based on calls
   // to compareTo(). You may assume that courses is never null nor empty. You must
   // use a loop to iterate over the courses array.
   Course findSmallest(Course[] courses) {
      Course smallest = courses[0];
      for (Course course : courses) {
         if (course.compareTo(smallest) < 0) {
            smallest = course;
         }
      }
      return smallest;
   }

   // Define the method findItem() that takes two parameters:
   // This method should return the index into courses where the course lookFor if
   // found, a negative number otherwise. You must use a loop to iterate over the
   // courses array.
   int findItem(Course[] courses, Course lookFor) {
      for (int i = 0; i < courses.length; i++) {
         if (courses[i].equals(lookFor)) {
            return i;
         }
      }
      return -1;
   }
}
