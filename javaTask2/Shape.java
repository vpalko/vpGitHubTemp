public class Shape {

  int id;
  String type;
  int height;
  int width;

  /**
   * Constructor for Shape class
   * 
   * @param type   the price of this product as a double
   * @param height the name or title of this product
   * @param width  the number of this product in stock
   */
  public Shape(int id, String type, int height, int width) {
    this.id = id;
    this.type = type;
    this.height = height;
    this.width = width;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getWidth() {
    return this.width;
  }

  public void setWidty(int width) {
    this.width = width;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getShapeID() {
    return this.id;
  }

  public void setShapeID(int id) {
    this.id = id;
  }

  public String getShapeDetails() {
    return "This is a " + this.type + " with width: " + this.width + ", and height: " + this.height;
  }
}