package java082224_3;

// Complete the code by replacing the three dots with the appropriate expression or statement in the method print() by using the Iterator approach.


import java.util.ArrayList;
import java.util.Iterator;

class Course{
    String dept;
    int number;
    public Course(String dept, int number){
        this.dept = dept;
        this.number = number;
    }
    public String getDept() { return this.dept; }
    public int getNumber() { return this.number; }
    public void setDept(String dept) { this.dept = dept; }
    public void setNumber(int number) { this.number = number; }
}  

public class ArrayListApp {
    ArrayList<Course> courseList = new ArrayList<Course>();
    public ArrayListApp(Course courses[]){
        for (int i = 0; i < courses.length; i++)
            courseList.add(courses[i]);
    }

    // Complete the print() method by using a while loop that uses the iterator and prints all courses in the courseList ArrayList.
    public void print(){
        Iterator<Course> i = courseList.iterator();
        while (i.hasNext()) {
          Course course = i.next();
          System.out.println(course.getDept() + " " + course.getNumber());
        }
    }

    public static void main(String[] args) throws Exception {
        Course introCourses[] = { new Course("ITSC",1212),
                                   new Course("ITSC",1213),
                                   new Course("ITSC",2175),
                                   new Course("ITSC", 2214)};
        ArrayListApp introCourseList = new ArrayListApp(introCourses);

        introCourseList.print();
    }
}
