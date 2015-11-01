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

    // Testing exception throws for checkWin()

    @Test(expected = IllegalArgumentException.class)
    public void testCheckWinException() {
        System.out.println("Testing CheckWin");
        GameBoard board = new GameBoard();

        // Lets get some no winner exceptions
        board.checkWin();
    }


    // Testing proper Win Senario for checkWin()

    @Test
    public void testCheckWinRow() {
        System.out.println("Testing CheckWin");
        GameBoard board = new GameBoard();

        // Set a winning condition
        board.setMove(1, 'y');
        board.setMove(2, 'y');
        board.setMove(3, 'y');

        assertEquals('y', board.checkWin());
    }


    // Testing proper Win Senario for checkWin()

    @Test
    public void testCheckWinColumn() {
        System.out.println("Testing CheckWin");
        GameBoard board = new GameBoard();

        // Set a winning condition
        board.setMove(1, 'x');
        board.setMove(4, 'y');
        board.setMove(7, 'y');
        board.setMove(2, 'x');
        board.setMove(5, 'x');
        board.setMove(8, 'x');

        assertEquals('x', board.checkWin());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsLegalMoveException() {

            System.out.println("Testing IsLegalMove");
            GameBoard board = new GameBoard();

            // Set a winning condition
            board.setMove(1, 'y');
            board.setMove(2, 'y');
            board.setMove(3, 'y');

            board.isLegalMove(12415);
            board.isLegalMove(10);
            board.isLegalMove(0);
    }

    @Test
    public void testIsLegalMove() {

            System.out.println("Testing IsLegalMove");
            GameBoard board = new GameBoard();

            // Set a winning condition
            board.setMove(1, 'y');
            board.setMove(2, 'y');
            board.setMove(3, 'y');

            assertEquals(board.isLegalMove(1), false);            assertEquals(board.isLegalMove(2), false);            assertEquals(board.isLegalMove(3), false);             assertEquals(board.isLegalMove(4), true);            assertEquals(board.isLegalMove(5), true);            assertEquals(board.isLegalMove(6), true);             assertEquals(board.isLegalMove(7), true);
            assertEquals(board.isLegalMove(8), true);
            assertEquals(board.isLegalMove(9), true);
    }
}
