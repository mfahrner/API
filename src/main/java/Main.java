/**
 * Created by mfahrner on 8/22/16.
 */
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;

import com.google.gson.Gson;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
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

        get("/hello", (req, res) -> "Hello World");

        get("/api", (request, response) -> gson.toJson(movies));

        post("/api", (req, res) -> {
            movies.add(gson.fromJson(req.body(), Movie.class));

            return 200;
        });
    }
}
