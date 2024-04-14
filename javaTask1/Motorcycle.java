package task1;
public class Motorcycle implements VehicleSpecification {
  private String brand;
  public Motorcycle(String brand) {
      this.brand = brand;
  }

  public void start() {
      System.out.println("Starting the " + brand + " motorcycle.");
  }
  public void accelerate(int speed) {
      System.out.println("Accelerating the " + brand + " motorcycle to " + speed + " km/h.");
  }

  public void brake() {
      System.out.println("Applying brakes to the " + brand + " motorcycle.");
  }
}