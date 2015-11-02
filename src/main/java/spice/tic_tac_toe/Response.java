package spice.tic_tac_toe;

public class Response {

    public char player;
    public String name;
    // Variables to be used when returning AI Move Information to controller
    public transient boolean ai;
    public transient int move;

    public Response(char player, String name) {
        this.player = player;
        this.name = name;
    }

    public Response(char player, String name, boolean ai, int move) {
        this.player = player;
        this.name = name;
        this.ai = ai;
        this.move = move;
    }

}
