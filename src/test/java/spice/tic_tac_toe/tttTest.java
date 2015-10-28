package spice.tic_tac_toe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class tttTest{
	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("spice.tic_tac_toe.tttTest");
    }

	@Test
	public void testJacocoGradle() {
		ttt t = new ttt();
		assertEquals(0, t.returnZero());
	}

}
