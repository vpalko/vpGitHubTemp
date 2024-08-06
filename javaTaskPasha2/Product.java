import java.util.ArrayList;
public abstract class Product {

    String title;
    int releaseYear;
    ArrayList genres;
    String ageRating;
    double price;
    
    public Product(String title, int releaseYear, ArrayList genres, String ageRating, double price) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.ageRating = ageRating;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public ArrayList<String> getGenres() {
        return genres;
    }
    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getAgeRating() {
        return ageRating;
    }
    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}