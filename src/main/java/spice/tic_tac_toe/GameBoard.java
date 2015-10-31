package spice.tic_tac_toe;

public class GameBoard {

    private char board[][];
    private char initChar;

    public GameBoard() {
        board = new char[3][3];
        initChar = ' ';

        for (int i = 0;i < 3; i++) {
            for (int j = 0;j < 3; j++) {
                board[i][j] =  initChar;
            }
        }
    }

    public void setMove(int boxId, char player) {

    }




}
