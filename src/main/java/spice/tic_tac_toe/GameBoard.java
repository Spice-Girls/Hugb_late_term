package spice.tic_tac_toe;

public class GameBoard {

    private char board[][];         // Board state
    private char initChar;          // intialization Character (Board is filled with this char)
    private boolean  player1Move;   // which players turn is it
    private Human p1;
    private Human p2;
    private AI a1;          


    public GameBoard(String name){
        p1 = new Human(name,'x');
        a1 = new AI('o');
        initChar = ' ';
        board = new char[3][3];
        for (int i = 0;i < 3; i++) {
            for (int j = 0;j < 3; j++) {
                board[i][j] =  initChar;
            }
        }
    }
    
    public GameBoard(String name, String name2){
        p1 = new Human(name,'x');
        p2 = new Human(name2,'o');
        initChar = ' ';
        board = new char[3][3];

        for (int i = 0;i < 3; i++) {
            for (int j = 0;j < 3; j++) {
                board[i][j] =  initChar;
            }
        }
    }

public Player checkWin() {
        // Check Colum Win
        for (int i = 0;i < 3; i++) {
            if(board[i][2] != initChar && board[i][2] == board[i][1] && board[i][1] == board[i][0]) {
                if(board[i][2] == 'x') return p1;
                else{
                    if(p2 == null) return a1;
                    else return p2;
                }
            }
        }

        // Check Row Win
        for (int i = 0;i < 3; i++) {
            if(board[2][i] != initChar && board[2][i] == board[1][i] && board[1][i] == board[0][i]) {
                if(board[2][i] == 'x') return p1;
                else{
                    if(p2 == null) return a1;
                    else return p2;
                }
            }
        }

        // Check Cross Win
        if(board[0][0] != initChar && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if(board[1][1] == 'x') return p1;
            else{
                if(p2 == null) return a1;
                else return p2;
            }
        } else if(board[2][0] != initChar && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            if(board[1][1] == 'x') return p1;
            else{
                if(p2 == null) return a1;
                else return p2;
            }
        }

        return null;
    }

    public char setMove(int boxId) {
        boxId -= 1;
        int x = boxId % 3;
        int y = (boxId - (boxId % 3))/3;

        // isLegalMove will throw error if it doesnt return true
        if(isLegalMove(boxId+1)) {
            player1Move = !player1Move;
            if(player1Move) {
                board[x][y] = p1.getMark();
                return p1.getMark();
            } else {
                if(p2 == null){
                    board[x][y] = p1.getMark();
                    return p1.getMark();
                }else{
                     board[x][y] = p2.getMark();
                     return p2.getMark();
                    }
                }
            }
        return board[x][y];
    }

    public boolean isLegalMove(int boxId) {
        boxId = boxId - 1;

        int x = boxId % 3;
        int y = (boxId - (boxId % 3))/3;

        if(boxId < 0 || boxId > 8) {
            throw new IllegalArgumentException("boxId is not within the 1-9 range");
        } else {
            if(board[x][y] == initChar) {
                return true;
            } else {
                return false;
            }
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
