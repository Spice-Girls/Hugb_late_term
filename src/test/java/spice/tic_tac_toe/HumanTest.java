package spice.tic_tac_toe;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanTest {

	@Test
	public void testGetName() {
		String name = "hössi";
		Human h = new Human(name, 'O');
		assertEquals(name, h.getName());
	}

	@Test
	public void testGetMark() {
		String name = "hössi";
		char mark = 'O';
		Human h = new Human(name, mark);
		assertEquals(mark , h.getMark());
	}
}
