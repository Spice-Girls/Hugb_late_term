package spice.tic_tac_toe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameBoardTest {

    // refrence board for testing purposes
    private char[][] refBoard = {{' ', 'x', ' '},{' ', 'x', ' '},{' ', 'x', ' '}};

    public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("spice.tic_tac_toe.GameBoardTest");
    }

    // Testing setMove()

    @Test
    public void testSetMove() {
        System.out.println("Testing setMove");
        GameBoard board = new GameBoard();

        // Setting up the right conditions
        board.setMove(1, 'x');
        board.setMove(4, 'x');
        board.setMove(7, 'x');

        // Refrence String
        String ref = "x  x  x  ";

        assertEquals(ref, board.toString());
    }

}
