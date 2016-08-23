/**
 * Created by mfahrner on 8/22/16.
 */


import java.util.ArrayList;
import static spark.Spark.*;
import com.google.gson.Gson;
import static spark.Spark.get;

public class Main {

    private static ArrayList<Movie> movies = new ArrayList<>();
    private static Gson gson = new Gson();


    public static void main(String[] args) {

        String test = System.getenv("PORT");

        if (test != null) {
            port(Integer.valueOf(test));
        } else {
            port(5000);
        }
        staticFileLocation("/public");

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        get("/", (req, res) -> "Hello World");

        get("/api", (request, response) -> gson.toJson(movies));

        post("/api", (req, res) -> {
            movies.add(gson.fromJson(req.body(), Movie.class));

            return 200;
        });
    }
}
