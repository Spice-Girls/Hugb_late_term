package spice.tic_tac_toe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

import com.google.gson.Gson;

import org.json.simple.JSONObject;

public class Controller implements SparkApplication {

    private GameBoard board;

    private Gson gson;

    public Controller() {
        gson = new Gson();
        board = new GameBoard();
    }

    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication controller = new Controller();

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        controller.init();
    }

    @Override
    public void init() {
        Spark.staticFileLocation("/public");

        get("/", (req, res) -> "Hola Senorita");

        post("/MakeMove", (req, res) -> {
            Response jsonResponse = new Response(true, 'x', "Sveinbjorn", true);
            return gson.toJson(jsonResponse);
            //= board.HumanMove(res.queryParams("boxId"));
    	});

        post("/GetState", (req, res) -> {
            char a[][] = {{'1','2','3'},{'4','5','6'}};
            //char a[][] = board.GetState();
            return gson.toJson(a);
        });

        post("/Restart", (req, res) -> {
            boolean worked = true;
            //worked = board.Reset();
            return gson.toJson(worked);
        });

        post("/AiMove", (req, res) -> {
            Response jsonResponse = new Response(true, 'x', "Sveinbjorn", true, true, 2);
            return gson.toJson(jsonResponse);
        });

    }

}
