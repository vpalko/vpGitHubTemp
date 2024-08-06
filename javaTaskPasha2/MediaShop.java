import java.util. *;
import java.io. *;
public class MediaShop {
    private ArrayList<Product> media = new ArrayList<>();

    public MediaShop() {
        try {
            String line;
            int i = 0;
            BufferedReader mediaRead = new BufferedReader(new FileReader("media.txt"));
            while ((line = mediaRead.readLine()) != null) {
                if (i != 0) {
                    String[] lineData = line.split(",");
                    String genres = lineData[3].replace("[", "").replace("]", "");
                    ArrayList<String> genresList = new ArrayList<String>(Arrays.asList(
                        genres.split(";")
                    ));
                    if (lineData[0].trim().equalsIgnoreCase("movie")) {
                        Movie movie = new Movie(
                            lineData[1].trim(),
                            Integer.parseInt(lineData[2].trim()),
                            genresList,
                            lineData[4].trim(),
                            Double.parseDouble(lineData[5].trim()),
                            Integer.parseInt(lineData[6].trim())
                        );
                        media.add(movie);
                    } else if (lineData[0].trim().equalsIgnoreCase("game")) {
                        Game game = new Game(
                            lineData[1].trim(),
                            Integer.parseInt(lineData[2].trim()),
                            genresList,
                            lineData[4].trim(),
                            Double.parseDouble(lineData[5].trim()),
                            lineData[6].trim()
                        );
                        media.add(game);
                    }
                }
                i++;
            }
            mediaRead.close();

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, our store is closed");
        } catch (Exception err) {
            System.out.println("UNABLE TO READ FILE");
            err.printStackTrace();
        }
    }
        public ArrayList<Product> getProducts() {
            return media;
        }
}