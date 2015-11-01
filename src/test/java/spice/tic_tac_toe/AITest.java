package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AITest {

	@Test
	public void testGetName() {
		String name = "computerSaysNo";
		AI a = new AI('X');
		assertEquals(name, a.getName());
	}
	
	@Test
	public void testGetMove() {
		GameBoard t = new GameBoard();
		AI a = new AI('X');
		for(int i = 1; i < 10; i++){
			assertEquals(a.getMove(t), i);
			t.setMove(i, a.getMark());
		}
	}

}