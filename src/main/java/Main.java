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
        get("/hello", (req, res) -> "Hello World");
    }
}
