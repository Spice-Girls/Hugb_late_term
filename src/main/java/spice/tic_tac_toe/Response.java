package spice.tic_tac_toe;

public class Response {


    public boolean success;
    public char player;
    public String name;
    public boolean winner;

    public Response(boolean success, char player, String name, boolean winner) {
        this.success = success;
        this.player = player;
        this.name = name;
        this.winner = winner;
    }



}
