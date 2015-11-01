package spice.tic_tac_toe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

import org.json.simple.JSONObject;

public class Controller implements SparkApplication {

    private GameBoard board;

    public Controller() {
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
        post("/makeMove", (req, res) -> {
		return Character.toString(this.board.setMove(Integer.parseInt(req.queryParams("id"))));
	});
        // post("/setName", (req, res) -> {
        //     chuck.alterName(
        //         req.queryParams("firstName"),
        //         req.queryParams("lastName")
        //     );
        //     res.status(200);
        //     return res;
        // });
        // get("/resetName", (req, res) -> {
        //     chuck.resetName();
        //     res.status(200);
        //     return res;
        // });
    }

}
