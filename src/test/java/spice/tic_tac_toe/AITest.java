package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AITest {

	
	//name is random
	@Test
	public void testGetName() {
		/*String name = "computerSaysNo";
		AI a = new AI('X');
		assertEquals(name, a.getName());*/
		AI a = new AI('X');
		assert(!a.getName().isEmpty());
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
