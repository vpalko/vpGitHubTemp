import java.util.ArrayList;
public class Game extends Product {
    String system;

    public Game(String title, int releaseYear, ArrayList genres, String ageRating, double price, String system) {
        super(title, releaseYear, genres, ageRating, price);
        this.system = system;
    }
    public String getSystem() {
        return system;
    }
    public void setSystem(String runTime) {
        this.system = system;
    }
}