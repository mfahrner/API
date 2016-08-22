/**
 * Created by mfahrner on 8/22/16.
 */
public class Movie {
    String name;
    String genre;
    int rating;

    public Movie(String name, String genre, int rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

