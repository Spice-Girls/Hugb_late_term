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
        board = new GameBoard("Player 1","Player 2");
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

        get("/", (req, res) -> {
            board = new GameBoard("Player 1","Player 2");
            return "<script>document.location = 'index.html';</script>";
        });

        post("/MakeMove", (req, res) -> {
            int query = Integer.parseInt(req.queryParams("id"));
            char player = board.setMove(query);
            String winner = "n";
            if(board.checkWin() != null){
                winner = board.checkWin().getName();
            }
            Response jsonResponse = new Response(player, winner);
            return gson.toJson(jsonResponse);
    	});

        post("/Restart", (req, res) -> {
            board = new GameBoard("Tester1","Tester2");
            return gson.toJson(true);
        });

        post("/AiMove", (req, res) -> {
            Response jsonResponse = new Response('x', "Sveinbjorn", true, 2);
            return gson.toJson(jsonResponse);
        });

    }

}
