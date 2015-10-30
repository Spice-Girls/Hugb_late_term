package spice.tic_tac_toe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class Controller implements SparkApplication {

    private char[] board;
    private char x;
    private char y;

    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication controller = new Controller();

        //String port = System.getenv("PORT");
        String port = "9090";
        System.out.println(port);
        if (port != null) {
            port(Integer.valueOf(port));
        }

        controller.init();
    }

    @Override
    public void init() {
        board = new char[9];
        x = 'X';
        y = 'Y';


        get("/", (req, res) -> "Hola Senorita");
        // post("/makeMove", (req, res) -> board.makeMove(req.queryParams("id")));
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
