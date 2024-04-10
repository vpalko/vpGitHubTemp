import javafx.scene.Parent;

public class Rectangle extends Shape implements Comparable {
  private int height;

  public Rectangle(int height, int width) {
    super(width);
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int compareTo(Object o) {
    Rectangle rectangle;

    if (o instanceof Rectangle) {
      rectangle = (Rectangle) o;
    } else {
      rectangle = Rectangle.class.cast(o);
    }

    if (this.height * getWidth() > rectangle.getHeight() * getWidth()) {
      return 1;
    } else if (this.height * getWidth() < rectangle.getHeight() * getWidth()) {
      return -1;
    } else {
      return 0;
    }
  }
}