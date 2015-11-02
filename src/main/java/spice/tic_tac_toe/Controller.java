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

        get("/", (req, res) -> "<script>document.location = 'index.html';</script>");

        post("/MakeMove", (req, res) -> {
            int query = Integer.parseInt(req.queryParams("id"));
            char player = board.setMove(query);
            boolean legal = board.isLegalMove(query);
            String winner = Character.toString(board.checkWin());
            boolean win = false;
            if (winner != "n") {
                win = true;
            }
            Response jsonResponse = new Response(win, player, winner, legal);
            return gson.toJson(jsonResponse);
    	});

        post("/GetState", (req, res) -> {
            char a[][] = {{'1','2','3'},{'4','5','6'}};
            //char a[][] = board.GetState();
            return gson.toJson(a);
        });

        post("/Restart", (req, res) -> {
            board = new GameBoard();
            return gson.toJson(true);
        });

        post("/AiMove", (req, res) -> {
            Response jsonResponse = new Response(true, 'x', "Sveinbjorn", true, true, 2);
            return gson.toJson(jsonResponse);
        });

    }

}
