package spice.tic_tac_toe;

public class Response {


    public boolean success;
    public char player;
    public String name;
    public boolean winner;
    // Variables to be used when returning AI Move Information to controller
    public transient boolean ai;
    public transient int move;

    public Response(boolean success, char player, String name, boolean winner) {
        this.success = success;
        this.player = player;
        this.name = name;
        this.winner = winner;
    }

    public Response(boolean success, char player, String name, boolean winner, boolean ai, int move) {
        this.success = success;
        this.player = player;
        this.name = name;
        this.winner = winner;
        this.ai = ai;
        this.move = move;
    }

}
