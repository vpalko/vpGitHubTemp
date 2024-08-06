import java.util.ArrayList;
public class Movie extends Product {

    int runTime;

    public Movie(String title, int releaseYear, ArrayList genres, String ageRating, double price, int runTime) {
        super(title, releaseYear, genres, ageRating, price);
        this.runTime = runTime;
    }
    public int getRunTime() {
        return runTime;
    }
    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
}