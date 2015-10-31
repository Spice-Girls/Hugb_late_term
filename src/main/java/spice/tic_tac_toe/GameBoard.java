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

    public char checkWin() {
        // Check Colum Win
        for (int i = 0;i < 3; i++) {
            if(board[i][2] != initChar && board[i][2] == board[i][1] && board[i][1] == board[i][0]) {
                return board[i][2];
            }
        }

        // Check Row Win
        for (int i = 0;i < 3; i++) {
            if(board[2][i] != initChar && board[2][i] == board[1][i] && board[1][i] == board[0][i]) {
                return board[2][i];
            }
        }

        // Check Cross Win
        if(board[0][0] != initChar && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[1][1];
        } else if(board[2][0] != initChar && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return board[1][1];
        }

        throw new IllegalArgumentException("no Winner");
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