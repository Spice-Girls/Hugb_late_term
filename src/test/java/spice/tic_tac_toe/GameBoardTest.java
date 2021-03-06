package spice.tic_tac_toe;

import java.util.ArrayList;
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
        GameBoard board = new GameBoard("Tester1", "Tester2");

        // Setting up the right conditions
        board.setMove(1);
        board.setMove(4);
        board.setMove(7);

        // Refrence String
        String ref = "x  o  x  ";

        assertEquals(ref, board.toString());
    }

    // Testing exception throws for checkWin()

    @Test
    public void testCheckWinException() {
        System.out.println("Testing CheckWin");
        GameBoard board = new GameBoard("Tester1", "Tester2");

        // Lets get some no winner exceptions
        board.checkWin();
    }


    // Testing proper Win Senario for checkWin()

    @Test
    public void testCheckWinRow() {
        System.out.println("Testing CheckWin");
        GameBoard board = new GameBoard("Tester1", "Tester2");

        // Set a winning condition
        board.setMove(1);
        board.setMove(8);
        board.setMove(2);
        board.setMove(9);
        board.setMove(3);
        board.setMove(4);

        assertEquals('x', board.checkWin().getMark());
    }


    // Testing proper Win Senario for checkWin()

    @Test
    public void testCheckWinColumn() {
        System.out.println("Testing CheckWin");
        GameBoard board = new GameBoard("Tester1", "Tester2");

        // Set a winning condition
        board.setMove(1);
        board.setMove(5);
        board.setMove(7);
        board.setMove(2);
        board.setMove(4);
        board.setMove(8);

        assertEquals('x', board.checkWin().getMark());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsLegalMoveException() {

            System.out.println("Testing IsLegalMove");
            GameBoard board = new GameBoard("Tester1", "Tester2");

            // Set a winning condition
            board.setMove(1);
            board.setMove(2);
            board.setMove(3);

            board.isLegalMove(12415);
            board.isLegalMove(10);
            board.isLegalMove(0);
    }

    @Test
    public void testIsLegalMove() {

            System.out.println("Testing IsLegalMove");
            GameBoard board = new GameBoard("Tester1", "Tester2");

            // Set a winning condition
            board.setMove(1);
            board.setMove(2);
            board.setMove(3);

            assertEquals(board.isLegalMove(1), false);            assertEquals(board.isLegalMove(2), false);            assertEquals(board.isLegalMove(3), false);             assertEquals(board.isLegalMove(4), true);            assertEquals(board.isLegalMove(5), true);            assertEquals(board.isLegalMove(6), true);             assertEquals(board.isLegalMove(7), true);
            assertEquals(board.isLegalMove(8), true);
            assertEquals(board.isLegalMove(9), true);
    }

    @Test
    public void testGetPlayerNames() {
        GameBoard board = new GameBoard("Tester1", "Tester2");
        ArrayList<String> list =(ArrayList<String>) board.getPlayerNames();
        assertEquals(list.get(0),"Tester1");
        assertEquals(list.get(1),"Tester2");
    }
}
