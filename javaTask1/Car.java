package task1;
public class Car implements VehicleSpecification {
  private String brand;
  public Car(String brand) {
      this.brand = brand;
  }

  public void start() {
      System.out.println("Starting the " + brand + " car.");
  }
  public void accelerate(int speed) {
      System.out.println("Accelerating the " + brand + " car to " + speed + " km/h.");
  }

  public void brake() {
      System.out.println("Applying brakes to the " + brand + " car.");
  }
}