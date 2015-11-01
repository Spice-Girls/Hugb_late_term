package spice.tic_tac_toe;

import edu.princeton.cs.introcs.StdOut;

public class AI extends Player{
	
	public AI(char mark){
		super("computerSaysNo",mark);
	}

	public int getMove(GameBoard gameBoard){
		
		for(int i = 1; i < 10; i++){
			if(gameBoard.isLegalMove(i)){
				return i;
			}

		}
		//this should never happen
		return 0;
	}
	
}
