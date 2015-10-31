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
            boxId -= 1;
            int x = boxId % 3;
            int y = (boxId - (boxId % 3))/3;

            if(boxId < 0 || boxId > 8) {
                throw new IllegalArgumentException("boxId is not within the 1-9 range");
            }

            if(board[x][y] != initChar) {
                throw new IllegalArgumentException("boxId refrences an already set box");
            } else {
                board[x][y] = player;
            }
        }


    public String toString() {
        String retString = "";
        for (int i = 0; i < 9; i++) {
            int x = i % 3;
            int y = (i - (i % 3))/3;
            retString += board[x][y];
        }
        return retString;
    }




}
