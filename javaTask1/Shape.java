package task1;
public class Shape {
    
  private int width;
  public Shape(int width) {
      this.width = width;
  }
  public int getWidth() {
      return width;
  }
  public void setWidth(int width) {
      this.width = width;
  }
  
  public double getArea() {
      System.out.println("Doesn't work!");
      return 0;
  }
  
  
}